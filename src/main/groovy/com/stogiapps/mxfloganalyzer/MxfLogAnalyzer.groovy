package com.stogiapps.mxfloganalyzer

import groovy.io.FileType
import groovy.transform.PackageScope
import org.springframework.beans.factory.annotation.Autowire
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
@PackageScope
final class MxfLogAnalyzer {

    @Autowired
    private final SingleLogFileAnalyzer singleLogFileAnalyzer

    void analyze(String inputFilePath, String logDirectoryPath) {
        def inputFileNames = new File(inputFilePath).readLines() as Set

        def logDirectory = new File(logDirectoryPath)

        def logFiles = []
        logDirectory.eachFileRecurse (FileType.FILES) { file ->
            logFiles << file
        }

        def statistics = []
        logFiles.each { File logFile ->
            statistics  += singleLogFileAnalyzer.analyze(logFile, inputFileNames)

        }

        statistics.each { println it.toString() }
    }

}
