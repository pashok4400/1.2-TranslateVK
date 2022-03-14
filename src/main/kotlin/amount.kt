fun main() {
    var amount = 923423432
    val itemCommission = amount * 0.0075
    val commission = if(itemCommission <= 3500) 3500 else (itemCommission).toInt()
    println("itemCommission за перевод: $commission копеек.")

}

