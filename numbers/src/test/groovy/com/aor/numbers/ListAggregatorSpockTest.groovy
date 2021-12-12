package com.aor.numbers

import spock.lang.Specification

class ListAggregatorSpockTest extends Specification {

    def "sum"() {

        given:
            var aggregator = new ListAggregator()
            var list = [1, 2, 4, 2, 5]
        when:
            int sum = aggregator.sum(list)
        then:
            sum == 14
    }

    def "max"(){

        given:
            var aggregator = new ListAggregator()
            var list = [1, 2, 4, 2, 5]
        when:
            int max = aggregator.max(list)
        then:
            max == 5
    }

    def "max_bug_7263"(){

        given:
            var aggregator = new ListAggregator()
            var list = [-1, -4, -5]
        when:
            int max = aggregator.max(list)
        then:
            max == -1
    }

    def "min"() {
        given:
            var aggregator = new ListAggregator()
            var list = [1, 2, 4, 2, 5]
        when:
            int min = aggregator.min(list)
        then:
            min == 1
    }

    def "distinct"() {

        given:
            var stub = Mock(GenericListDeduplicator)
            stub.deduplicate(_ as List<Integer>) >> [1, 2, 4, 5]
            var aggregator = new ListAggregator()
            var list = [1, 2, 4, 2, 5]
        when:
            int distinct = aggregator.distinct(list, stub)
        then:
            distinct == 4
    }

    def "distinct_bug_8726"() {

        given:
            var stub = Mock(GenericListDeduplicator)
            stub.deduplicate(_ as List<Integer>) >> [1, 2, 4]
            var aggregator = new ListAggregator()
            var list = [1, 2, 4, 2]
        when:
            int distinct = aggregator.distinct(list, stub)
        then:
            distinct == 3
    }

}
