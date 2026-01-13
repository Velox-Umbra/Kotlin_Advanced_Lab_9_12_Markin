var age: Int = 18
    set(value) {
        if((value > 0) and (value < 110))
            field = value
    }

fun main() {
    val hero = Hero("Утер")
    hero.health = 140
    println(hero.health)
    println(hero.stamina)
//    hero.level = 25
    hero.levelUp()
}