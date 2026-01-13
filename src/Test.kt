var age: Int = 18
    set(value) {
        if((value > 0) and (value < 110))
            field = value
    }

data class Item(
    val id: Int,
    val name: String,
    val quantity: Int
) {
    override fun toString(): String {
        return "ID:$id name:$name quantity:$quantity"
    }
}
fun main() {
//    val hero = Hero("Утер")
//    hero.health = 140
//    println(hero.health)
//    println(hero.stamina)
////    hero.level = 25
//    hero.levelUp()
    val sword = Item(1, "Sword", 1)
    val betterSword = sword.copy(quantity = 2, name = "Железный меч")
    println(sword.toString())
    println(betterSword.toString())
}