interface Movable{
    var speed: Int
    val model: String
    val number: String
    fun move()
    fun stop() {
            println("Останавливаемся...")
    }
}
class Car(override val model: String,
          override val number: String) : Movable {
    override var speed = 60
    override fun move() {
        println("Едем на машине")
    }
}
class Aircraft(override val model: String,
               override val number: String) : Movable{
    override var speed = 600
    override fun move() {
        println("Летим на самолете")
    }

    override fun stop() {
        println("Приземляемся...")
    }
}

interface Worker{
    fun work()
}
interface Student{
    fun study()
}
class WorkerStudent(val name: String) : Worker, Student {
    override fun study() = println("$name учится.")

    override fun work() = println("$name работает")
}
fun travel(obj: Movable) = obj.move()


interface VideoPlayable {
    fun play()
}
interface AudioPlayable {
    fun play()
}
fun main() {
//    val car: Movable = Car()
//    val aircraft: Movable = Aircraft()
//
//    travel(car)
//    travel(aircraft)
    val pavel = WorkerStudent("Pavel")
    pavel.work()
    pavel.study()

    val car = Car("LADA", "234LAD")
    val aircraft = Aircraft("Boeing", "737")
}