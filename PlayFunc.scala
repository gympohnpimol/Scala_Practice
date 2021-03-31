object PlayFunc extends App {
    val addFunc = (x: Int, y: Int) => x + y // lambda
    println(addFunc(10, 20)) //30

    val add5 = (x: Int) => addFunc(5, x)
    println(add5(12))

    val addF = new Function[Int, Int]{ // equal (Int) => Int
        override def apply(v1: Int): Int = v1 + 1
    }
    println(addF(10))

    val addFunc2 = new ((Int, Int) => Int){
        override def apply(v1: Int, v2: Int): Int = v1 + v2
    }
    println(addFunc2(10, 5))

    def concat: (String, String) => String = new Function2[String, String, String]{
        override def apply(v1: String, v2: String): String = v1 + v2
    }
    println(concat("Hello", " Scala"))
}