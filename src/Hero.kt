class Hero(val name: String) {
    var health: Int = 100
        set(value){
            field = value.coerceIn(0, 100)
        }
    var stamina: Int = 50
        get() = field + 10
    var level: Int = 1
        private set
    fun levelUp() {
        level++
        println("$name повысил уровень до $level")
    }
}

fun main() {
    val hero = Hero("Утер")
    hero.health = 140
    println(hero.health)
    println(hero.stamina)
//    hero.level = 25
    hero.levelUp()
}