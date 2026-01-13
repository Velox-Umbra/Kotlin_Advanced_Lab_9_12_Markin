fun main() {
    val manager = ResourceManager()
    val gas = OutposResource(1, "Gas", 100)
    val mineral = OutposResource(2, "Mineral", 325)
    manager.add(gas)
    manager.add(mineral)
    manager.printAll()
}