package com.aor.numbers

import spock.lang.Specification

class ListFiltererSpockTest extends Specification {

    def "filterNotMultipleOf2"() {

        given:
            var list = [1, 2, 5, -3, 76, 0, -32, 65, -1243, 5, 8, -46]
            var filter = new DivisibleByFilter(2)
            var filterer = new ListFilterer(filter)
        when:
            var expected = filterer.filter(list)
        then:
            expected == [2, 76, 0, -32, 8, -46]
    }

    def "filterNotPositive"() {

        given:
            var list = [1, 2, 5, -3, 76, 0, -32, 65, -1243, 5, 8, -46]
            var filter = new PositiveFilter();
            var filterer = new ListFilterer(filter);
        when:
            var expected = filterer.filter(list)
        then:
            expected == [1, 2, 5, 76, 65, 5, 8]
    }
}
