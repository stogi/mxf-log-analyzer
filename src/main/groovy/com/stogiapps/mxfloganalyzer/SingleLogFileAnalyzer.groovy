package com.stogiapps.mxfloganalyzer

import groovy.transform.PackageScope
import org.joda.time.LocalTime
import org.springframework.stereotype.Component

@Component
@PackageScope
final class SingleLogFileAnalyzer {

    private static final TRANSFER_STARTED_MARKER = 'Transferring files'
    private static final TRANSFER_FINISHED_MARKER = 'Source finalize command'
    private static final TRANSFER_LINE_SPLITTER = /(\d{2}:\d{2}:\d{2}\.\d{3}).*from (.*) -.*\[(.*)]/

    Set<MxfFileTransferStatistic> analyze(File logFile, Set<String> fileNames) {
        def fileNamesFoundInLogFile = findFileNamesIn(logFile, fileNames)

        if (fileNamesFoundInLogFile.empty) {
            return [] as Set
        }

        def previousLine
        def statisticsById = [:]

        logFile.eachLine { String currentLine ->
            if (currentLine.contains(TRANSFER_STARTED_MARKER)) {
                def matcher = previousLine =~ TRANSFER_LINE_SPLITTER
                def startTime = matcher[0][1] as String
                def serverName = matcher[0][2] as String
                def id = matcher[0][3] as String

                statisticsById[id] = MxfFileTransferStatistic.create(fileNamesFoundInLogFile, serverName, startTime)
            }

            if (currentLine.contains(TRANSFER_FINISHED_MARKER)) {
                def matcher = currentLine =~ TRANSFER_LINE_SPLITTER
                def endTime = LocalTime.parse(matcher[0][1])
                def id = matcher[0][3]

                if (statisticsById.containsKey(id)) {
                    statisticsById[id] = statisticsById[id].copyWith(endTime: endTime)
                }
            }

            previousLine = currentLine
        }

        statisticsById.values() ?: [MxfFileTransferStatistic.create(fileNamesFoundInLogFile)] as Set
    }

    private Set<String> findFileNamesIn(File logFile, Set<String> fileNames) {
        def logContent = logFile.text
        fileNames.findAll { logContent.contains(it) }
    }

}
