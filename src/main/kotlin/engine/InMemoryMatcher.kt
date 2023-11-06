package engine

import events.Event
import predicates.Predicate

class InMemoryMatcher(private val predicates:List<Predicate>):Matcher {

    override fun run(events: List<Event>): List<MaterializedMatch>{
        val materializedMatches:ArrayList<MaterializedMatch> = ArrayList(events.size)
        for(event:Event in events){
            for(predicate:Predicate in predicates){
                materializedMatches.add(MaterializedMatch(event, predicate))
            }
        }
        return materializedMatches
    }
}