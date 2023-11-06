package predicates

import events.Event

class LessThan (private val symbol: String, private val amount: Double): Predicate {

    override fun match(event: Event): Boolean {
        if(symbol != event.symbol()){
            return false;
        }
        return event.amount() <= amount
    }
}