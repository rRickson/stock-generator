package predicates

import events.Event

class LessThan (private val symbol: String, private val amount: Double): Predicate {

    override fun match(event: Event): Boolean {
        TODO("Not yet implemented")
    }
}