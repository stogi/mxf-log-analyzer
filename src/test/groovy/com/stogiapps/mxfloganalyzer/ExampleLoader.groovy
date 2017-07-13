package com.stogiapps.mxfloganalyzer

final class ExampleLoader {

    private static final EXAMPLES_DIRECTORY_PATH = './src/test/resources/examples'

    static File load(String name) {
        new File("${EXAMPLES_DIRECTORY_PATH}/${name}.log")
    }

    private ExampleLoader() {
        throw new IllegalAccessException()
    }

}
