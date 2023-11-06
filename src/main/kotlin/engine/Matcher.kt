package engine

import events.Event

interface Matcher {
    fun run(events: List<Event>): List<MaterializedMatch>
}