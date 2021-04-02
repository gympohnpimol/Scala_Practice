object PlayImplicit extends App{
    // sample1
    case class Person(name:String){
        def greet: String = s"Hi $name"
    }
    implicit def toPerson(str: String) : Person = Person(str)
    println("Vi".greet)

    // sanple2
    def decrease(a: Int)(b: Int): Int = a - b
    println(decrease(10)(5))

    def increase(a: Int)(implicit amount: Int): Int = a + amount
    implicit val defaultAmount = 10
    println(increase(2))

    // sample3
    implicit class RichInt(value: Int){
        def isEven: Boolean = value % 2 == 0
        def sqrt: Double = Math.sqrt(value)
    }
    println(10.isEven)
    println(10.sqrt)

    //sample4
    implicit def strToInt(str: String): Int = Integral.valueOf(str)
    println("8"/4)
}