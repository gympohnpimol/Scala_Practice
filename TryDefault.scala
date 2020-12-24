object TryDefault extends App{
    def hello(name: String = "No", id: Int = 0): Unit = {
        println("Hello " + name + ", id: " + id)
    }
    hello(id = 2110, name = "Gym")
    hello() //default
}
