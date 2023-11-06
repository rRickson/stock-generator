package generator

import predicates.EqualThan
import predicates.GreaterThan
import predicates.LessThan
import predicates.Predicate
import kotlin.random.Random


class UserPredicatesGenerator():PredicatesGenerator {

    override fun generate(amount: Int): List<Predicate> {
        val intStream = 0 until amount
        return intStream.map { create() }.toList()
    }

    private fun create():Predicate{
        val rand = Random
        val result = rand.nextInt(3-1) +1
        val predicate = when(result){
            1-> EqualThan(Randomizer().symbol(), Randomizer().amount())
            2-> LessThan(Randomizer().symbol(), Randomizer().amount())
            else-> GreaterThan(Randomizer().symbol(), Randomizer().amount())
        }
        return predicate
    }

}