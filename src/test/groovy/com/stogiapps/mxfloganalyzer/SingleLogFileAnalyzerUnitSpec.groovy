package com.stogiapps.mxfloganalyzer

import spock.lang.Specification

final class SingleLogFileAnalyzerUnitSpec extends Specification {

    private SingleLogFileAnalyzer analyzer

    void setup() {
        analyzer = new SingleLogFileAnalyzer()
    }

    void 'does not find file names in log file'() {
        when:
        def statistics = analyzer.analyze(ExampleLoader.load('example_1'), ['not-existing-file-name.mxf'] as Set)

        then:
        statistics.empty
    }

    void 'finds file names in log file example_1'() {
        when:
        def statistics = analyzer.analyze(ExampleLoader.load('example_1'), ['FKAT851R_01.mxf'] as Set)

        then:
        statistics == [
            MxfFileTransferStatistic.create(['FKAT851R_01.mxf'], 'ukmcfdsl02.ebms.tv', '15:40:12.002', '16:21:53.734'),
            MxfFileTransferStatistic.create(['FKAT851R_01.mxf'], 'ukwpfdsl01.ebms.tv', '15:40:12.668', '16:08:26.248')
        ] as Set
    }

    void 'finds file names in log file example_2'() {
        when:
        def statistics = analyzer.analyze(ExampleLoader.load('example_2'), ['WEBF2717_VA22_GEN.mxf'] as Set)

        then:
        statistics == [
            MxfFileTransferStatistic.create(['WEBF2717_VA22_GEN.mxf'], 'ukmcfdsl01.ebms.tv', '08:46:30.301', '08:48:05.499'),
            MxfFileTransferStatistic.create(['WEBF2717_VA22_GEN.mxf'], 'ukwpfdsl02.ebms.tv', '08:46:31.171', '08:48:12.210')
        ] as Set
    }

    void 'finds file names in log file example_3'() {
        when:
        def statistics = analyzer.analyze(ExampleLoader.load('example_3'), ['FKIW776N_01.mxf', 'CBAP963D_01.mxf', 'CBIE773L_01.mxf', 'CAQI483F_01.mxf', 'FKRD518T_01.mxf', 'CBRB309X_02.mxf', 'CBAS911X_01.mxf', 'NGKM492K_71.mxf', 'CAQF261T_01.mxf', 'CBIE271R_01.mxf', 'CBRC043X_01.mxf', 'CAQF509E_01.mxf'] as Set)

        then:
        statistics == [
            MxfFileTransferStatistic.create(['FKIW776N_01.mxf', 'CBAP963D_01.mxf', 'CBIE773L_01.mxf', 'CAQI483F_01.mxf', 'FKRD518T_01.mxf', 'CBRB309X_02.mxf', 'CBAS911X_01.mxf', 'NGKM492K_71.mxf', 'CAQF261T_01.mxf', 'CBIE271R_01.mxf', 'CBRC043X_01.mxf', 'CAQF509E_01.mxf'], 'ukwpfdsl01.ebms.tv', '13:53:02.712', '15:49:43.323'),
            MxfFileTransferStatistic.create(['FKIW776N_01.mxf', 'CBAP963D_01.mxf', 'CBIE773L_01.mxf', 'CAQI483F_01.mxf', 'FKRD518T_01.mxf', 'CBRB309X_02.mxf', 'CBAS911X_01.mxf', 'NGKM492K_71.mxf', 'CAQF261T_01.mxf', 'CBIE271R_01.mxf', 'CBRC043X_01.mxf', 'CAQF509E_01.mxf'], 'ukmcfdsl01.ebms.tv', '13:53:10.635', null)
        ] as Set
    }

}
