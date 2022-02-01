package com.aor.numbers

import spock.lang.Specification

class DivisibleByFilterSpockTest extends Specification {

    def "divisibleByZero"(a, b) {

        given:
            def filter = new DivisibleByFilter(0);
        expect:
            filter.accept(a) == b
        where:
            a | b
            0 | false
            -1 | false
            5 | false
    }

    def "even"(a, b) {

        given:
            def filter = new DivisibleByFilter(2);
        expect:
            filter.accept(a) == b
        where:
            a | b
            0 | true
            -1 | false
            5 | false
        2345670 | true
            2 | true
    }

    def "strangeDivisor"(a, b) {

        given:
            def filter = new DivisibleByFilter(13);
        expect:
            filter.accept(a) == b
        where:
            a | b
            0 | true
            -1 | false
            5 | false
            13 | true
            13*43 | true

    }
}
