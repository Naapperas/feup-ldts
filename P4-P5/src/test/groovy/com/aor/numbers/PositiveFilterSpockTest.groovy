package com.aor.numbers

import spock.lang.Specification

class PositiveFilterSpockTest extends Specification {

    def "pos"(a, b) {

        given:
            var filter = new PositiveFilter()
        expect:
            filter.accept(a) == b
        where:
            a | b
            4 | true
            -4 | false
            0 | false
    }
}
