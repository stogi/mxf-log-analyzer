package com.stogiapps.mxfloganalyzer

import groovy.transform.Immutable
import groovy.transform.PackageScope
import groovy.transform.TupleConstructor
import org.joda.time.LocalTime

@Immutable(copyWith = true, knownImmutableClasses = [LocalTime])
@TupleConstructor
@PackageScope
class MxfFileTransferStatistic {

    static MxfFileTransferStatistic create(List<String> fileNames, String serverName, String startTime, String endTime) {
        new MxfFileTransferStatistic(fileNames as Set, serverName, LocalTime.parse(startTime), endTime ? LocalTime.parse(endTime) : null)
    }

    static MxfFileTransferStatistic create(Set<String> fileNames, String serverName, String startTime) {
        new MxfFileTransferStatistic(fileNames, serverName, LocalTime.parse(startTime), null)
    }

    static MxfFileTransferStatistic create(Set<String> fileNames) {
        new MxfFileTransferStatistic(fileNames, null, null, null)
    }

    Set<String> fileNames
    String serverName
    LocalTime startTime
    LocalTime endTime

    @Override
    String toString() {
        """ "${fileNames.join(';')}","${serverName ?: ''}","${startTime ?: ''}","${endTime ?: ''}" """.trim()
    }

}
