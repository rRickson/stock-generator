package generator

import predicates.Predicate

interface PredicatesGenerator {
    fun generate(amount: Int):List<Predicate>
}