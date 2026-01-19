class ResourceManager {
    private val resources = mutableListOf<OutpustResource>()

    fun add (resource: OutpustResource) {
        resources.add(resource)
        println("Добавлен ресурс: ${resource.name}")
    }

    fun get(name: String): OutpustResource? {
        return resources.find { it.name==name }
    }

    fun prinalAll() {
        println("Ресурсы базы")
        resources.forEach{ println("${it.name}: ${it.amount}") }
    }
}

fun main(){
    val manager = ResourceManager()
    val minerals = OutpustResource(1, "Minerals", 300)
    val gas = OutpustResource(2,"GAS",100)
    manager.add(minerals)
    manager.add(gas)
    manager.prinalAll()
}