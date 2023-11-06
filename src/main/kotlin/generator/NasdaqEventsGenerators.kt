package generator

import events.Event
import events.StockDown
import events.StockUp
import kotlin.random.Random

class NasdaqEventsGenerators():EventsGenerator {

    override fun generate(amount: Int): List<Event> {
        val intStream = 0 until amount
        return intStream.map { create() }.toList()
    }

    private fun create(): Event{
        val rand = Random
        val result: Int = rand.nextInt(2-0) + 1
        return if (result == 1){
            StockUp(Randomizer().symbol(), Randomizer().amount())
        }else{
            StockDown(Randomizer().symbol(), Randomizer().amount())
        }
    }
}