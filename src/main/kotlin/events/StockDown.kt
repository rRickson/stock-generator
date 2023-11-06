package events

class StockDown(val symbol: String, val amount: Double): Event{

    override fun amount(): Double {
        return amount
    }

    override fun symbol(): String {
        return symbol
    }

}