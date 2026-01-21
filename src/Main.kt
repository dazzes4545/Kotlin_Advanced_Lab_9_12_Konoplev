import kotlin.math.min

fun main(){
    val manager = ResourceManager()
    val minerals = OutpustResource(1, "Minerals", 300)
    val gas = OutpustResource(2,"GAS",100)
    manager.add(minerals)
    manager.add(gas)
    manager.prinalAll()
    println()
    val bonus = minerals.copy(amount = minerals.amount+50)
    println("Копия минералов с бонусом: $bonus")
}