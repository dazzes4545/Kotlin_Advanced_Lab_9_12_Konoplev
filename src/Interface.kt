interface Movable{
    fun move()
}
class Car: Movable{
    override fun move() {
        println("Едем на машине")
    }
}

class Aircraft: Movable{
    override fun move(){
        println("Летим на самолете")
    }
}

fun travel(obj: Movable)=obj.move()
