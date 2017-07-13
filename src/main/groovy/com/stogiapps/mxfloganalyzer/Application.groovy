package com.stogiapps.mxfloganalyzer

import groovy.util.logging.Log4j2
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@Log4j2
@SpringBootApplication
class Application implements CommandLineRunner {

    @Autowired
    private MxfLogAnalyzer mxfLogAnalyzer

    static void main(String[] args) {
        SpringApplication.run(Application, args)
    }

    @Override
    void run(String... arguments) {
        checkIfValid(arguments)

        def inputFilePath = arguments[0]
        def logDirectoryPath = arguments[1]
        def outputFilePath = arguments[2]

        mxfLogAnalyzer.analyze(inputFilePath, logDirectoryPath, outputFilePath)
    }

    private void checkIfValid(String... arguments) {
        if (arguments.size() < 3) {
            InvalidNumberOfArgumentsException.throwNow()
        }
    }
}
