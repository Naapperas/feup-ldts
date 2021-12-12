package com.aor.numbers

import spock.lang.Specification

class ListSorterSpockTest extends Specification {

    def "sort"() {

        given:
            var sorter = new ListSorter()
            var list = [3, 2, 6, 1, 4, 5, 7]
        when:
            var sorted = sorter.sort(list);
        then:
            sorted == [1, 2, 3, 4, 5, 6, 7]
    }

    def "sort_bug"() {

        given:
            var sorter = new ListSorter()
            var list = [1, 2, 4, 2]
        when:
            var sorted = sorter.sort(list);
        then:
            sorted == [1, 2, 2, 4]
    }

}
