package com.aor.numbers

import spock.lang.Specification

class ListDeduplicatorSpockTest extends Specification {

    def "deduplicate"() {

        given:
            var list = [1, 2, 4, 2, 5]
            var stub = Mock(GenericListSorter)
            stub.sort(_ as ArrayList) >> [1, 2, 2, 4, 5]
            var deduplicator = new ListDeduplicator(stub)
        when:
            var distinct = deduplicator.deduplicate(list)
        then:
            distinct == [1, 2, 4, 5]

    }

    def "deduplicate_bug"() {
        given:
            var list = [1, 2, 4, 2]
            var stub = Mock(GenericListSorter)
            stub.sort(_ as ArrayList) >> [1, 2, 2, 4]
            var deduplicator = new ListDeduplicator(stub)
        when:
            var distinct = deduplicator.deduplicate(list)
        then:
            distinct == [1, 2, 4]
    }

}
