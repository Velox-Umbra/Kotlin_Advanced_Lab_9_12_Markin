data class OutposResource(
    val id: Int,
    val name: String,
    val amount: Int
) {
    override fun toString(): String {
        return "Resource: $id | Name: $name | Amount: $amount"
    }
}

fun main() {
    val gas = OutposResource(1, "Gas", 100)
    val mineral = OutposResource(2, "Mineral", 325)
    println("Успех. Вы получили доп минералы. ${mineral.amount + 50}")
    val bonusMineral = mineral.copy(3, "Mineral Bonus", mineral.amount + 50)
    println(gas.toString())
    println(mineral.toString())
    println(bonusMineral.toString())
}