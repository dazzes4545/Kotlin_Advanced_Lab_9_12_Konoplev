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

