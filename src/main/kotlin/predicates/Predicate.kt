package predicates

import events.Event

interface Predicate {
    fun match(event:Event): Boolean
}