object TryCall extends App{

    def byValue(n: Long) : Unit = {
        println("by value: " + n)
        println("by value: " + n)
    }
    
    def byName(n: =>Long) : Unit = {
        println("by name: " + n)
        println("by name: " + n)
    }

    byValue(System.nanoTime())
    byName(System.nanoTime())

    def measure[T](operation: => T) : Long = {
        val time = System.currentTimeMillis()
        operation 
        System.currentTimeMillis() - time
    }

    val lists = (1 to 1000000).toList
    val usedTime = measure {
        lists.map(_ +1)
    }
    println(usedTime)
}
