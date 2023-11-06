package events

class StockDown(val symbol: String, val amount: Double): Event{

    override fun amount(): Double {
        TODO("Not yet implemented")
    }

    override fun symbol(): String {
        TODO("Not yet implemented")
    }

}