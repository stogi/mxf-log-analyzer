package com.stogiapps.mxfloganalyzer

import groovy.transform.InheritConstructors
import org.springframework.boot.ExitCodeGenerator

@InheritConstructors
final class InvalidNumberOfArgumentsException extends RuntimeException implements ExitCodeGenerator {

    int exitCode = 1

    static void throwNow() {
        throw new InvalidNumberOfArgumentsException('<input_file_path> <log_directory_path> <output_file_path>')
    }

}
