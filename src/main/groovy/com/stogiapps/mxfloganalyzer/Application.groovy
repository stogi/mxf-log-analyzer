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
    void run(String... args) throws Exception {
        mxfLogAnalyzer.analyze(args[0], args[1])
    }

}
