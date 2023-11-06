package generator

import events.Event
import kotlin.random.Random

class Randomizer: Event {

    override fun symbol(): String {
        val symbols:Array<String> = arrayOf("XOM","GE", "TM", "PG", "GOOG", "ING", "AAPL", "META", "NFLX")
        val r = Random
        return symbols[r.nextInt(9-1)+ 1]
    }

    override  fun amount(): Double {
        val rand = Random
        return rand.nextDouble(9000.0 - 10.0) + 10
    }
}