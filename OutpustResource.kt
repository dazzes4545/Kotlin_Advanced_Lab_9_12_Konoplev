data class OutpustResource(
    val id: Int,
    val name: String,
    val amount: Int
){
    override fun toString(): String {
        return "Ваш ресурс: $id\nИмя: $name\nКоличество: $amount"
    }
}

fun main() {
    val gas = OutpostResource(id = 1, name = "Gas", amount = 100)
    val mineral = OutpostResource(id = 2, name = "Minerals", amount = 250)
    println("Успех! Вы добыли дополнительное количество минералов: ${mineral.amount + 50}")
    val bonusMineral = OutpostResource(id = 3, name = "Minerals Bonus", amount = mineral.amount + 50)
    println(gas.toString())
    println(mineral.toString())
    println(bonusMineral.toString())
}
