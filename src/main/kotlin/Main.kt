import engine.InMemoryMatcher
import engine.MaterializedMatch
import events.Event
import generator.NasdaqEventsGenerators
import generator.UserPredicatesGenerator
import predicates.Predicate
import java.util.*

fun main() {
    println(">> Benchmarks: CAP 100 rules ");
    benchmarkCap(10,100);
    benchmarkCap(100,100);
    benchmarkCap(1_000,100);
    benchmarkCap(10_000,100);
    benchmarkCap(100_000,100);
    benchmarkCap(1_000_000,100);
    benchmarkCap(10_000_000,100);

    println(">> Benchmarks: NO CAP (rules x events) ");
    benchmarkCap(10,10);
    benchmarkCap(100,100);
    benchmarkCap(1_000,1_000);
    benchmarkCap(10_000,10_000);
    benchmarkCap(100_000,100_000);
}

private fun benchmarkCap(qtdEvents:Int, qtdRules:Int){
        // Generate rules preferences from users input
        val predicatesGenerator = UserPredicatesGenerator()
        val predicates:List<Predicate> = predicatesGenerator.generate(qtdRules)

        // Generate random events for NASDAQ

        val eventGenerator = NasdaqEventsGenerators()
        val events: List<Event> = eventGenerator.generate(qtdEvents)

        val matcher: InMemoryMatcher= InMemoryMatcher(predicates)

        val start = Date()
        val matches:List<MaterializedMatch> = matcher.run(events)
        val end= Date()
        println("Matching " + qtdEvents + " events / " + qtdRules + " predicates resulted in: [" + matches.size +
            "] match in " + (end.time- start.time) + " ms");
}