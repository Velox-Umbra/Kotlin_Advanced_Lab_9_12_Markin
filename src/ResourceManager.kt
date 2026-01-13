class ResourceManager {
    private val resources = mutableListOf<OutposResource>()
    fun add(resource: OutposResource) {
        resources.add(resource)
        println("Добавлен ресурс: ${resource.name}")
    }
    fun get(name: String) : OutposResource? {
        return resources.find { it.name == name }
    }
    fun printAll() {
        println("ресурсы базы")
        resources.forEach { println("${it.name}: ${it.amount}") }
    }
}