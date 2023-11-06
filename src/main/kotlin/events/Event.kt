package events

interface Event {
    fun symbol(): String
    fun amount(): Double
}