package generator

import events.Event

interface EventsGenerator {
    fun generate(amount: Int):List<Event>
}