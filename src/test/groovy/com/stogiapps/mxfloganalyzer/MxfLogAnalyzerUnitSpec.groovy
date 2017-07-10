package com.stogiapps.mxfloganalyzer

import spock.lang.Specification

final class MxfLogAnalyzerUnitSpec extends Specification {

    private MxfLogAnalyzer mxfLogAnalyzer

    void setup() {
        mxfLogAnalyzer = new MxfLogAnalyzer()
    }

    void 'true'() {
        expect:
        false
    }

}
