object TryFunctions extends App {

    def mySum(a: Int, b: Int): Int = {
        println("In mySum Function")
        a + b
    }

    def hello(name: String, id: Int): Unit = {
        println("Hello " + name + "  ID: " + id)
    }
    println(mySum(10,8))
    hello(name = "Gym", id = 2110)
}
