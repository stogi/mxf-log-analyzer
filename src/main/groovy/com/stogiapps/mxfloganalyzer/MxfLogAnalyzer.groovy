package com.stogiapps.mxfloganalyzer

import groovy.io.FileType
import groovy.transform.PackageScope
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
@PackageScope
final class MxfLogAnalyzer {

    @Autowired
    private SingleLogFileAnalyzer singleLogFileAnalyzer

    void analyze(String inputFilePath, String logDirectoryPath, String outputFilePath) {
        def inputFileNames = getAllInputFileNamesFrom(inputFilePath)
        def logFiles = getAllLogFilesIn(logDirectoryPath)
        def statistics = internalAnalyze(logFiles, inputFileNames)
        saveTo(outputFilePath, statistics)
    }

    private Set<String> getAllInputFileNamesFrom(String inputFilePath) {
        new File(inputFilePath).readLines() as Set
    }

    private List<File> getAllLogFilesIn(String logDirectoryPath) {
        def logDirectory = new File(logDirectoryPath)
        def logFiles = []
        logDirectory.eachFileRecurse(FileType.FILES) { file ->
            logFiles << file
        }
        logFiles
    }

    private List<MxfFileTransferStatistic> internalAnalyze(List logFiles, inputFileNames) {
        def statistics = []
        logFiles.each { File logFile ->
            statistics += singleLogFileAnalyzer.analyze(logFile, inputFileNames)
        }
        statistics
    }

    private void saveTo(String outputFilePath, List<MxfFileTransferStatistic> statistics) {
        def outputFile = new File(outputFilePath)
        statistics.each { MxfFileTransferStatistic statistic ->
            outputFile << statistic.toString() << '\n'
        }
    }

}
