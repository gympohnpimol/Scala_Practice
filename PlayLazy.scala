object PlayLazy extends App {
    lazy val x:Int = throw  new RuntimeException
    println(x)

    lazy val y:Int = {
        println("Inside y")
        10
    }
    println(y)
    println(y)

    def sideEffect: Boolean = {
        println("sideEffect")
        true
    }
    def simple: Boolean = false
    lazy val lazyCondition: Boolean = sideEffect

    println(if (simple && lazyCondition) "yes" else "no")
}

