object PlaySingleton extends App {
    //singleton object = static class
    //img

    class Book {
        println("Inside Book")
    }

    object Car {
        println("Inside Car")
    }
    Car
    new Book

    object Calculator {
        def Add(a: Int, b: Int): Int = {
            a + b
        }
        def Add(a: Int, b: Int, c: Int): Int = {
            a + b + c
        }
    }
    val result = Calculator.Add(10, 20)
    println(s"result = $result")

    //overloading
    val result2 = Calculator.Add(10, 20, 30)
    println(s"result = $result2")
}