package engine

import events.Event
import predicates.Predicate

import java.util.Date

class MaterializedMatch(private val event:Event, private val predicate:Predicate) {
    private val matchTime:Date = Date()

    override fun toString(): String {
        return "MaterializedMatch(event=$event, predicate=$predicate, matchTime=$matchTime)"
    }

}