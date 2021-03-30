object PlayCaseClass extends App{
    case class Book(id: Int, name:String, author:String)

    val b1 = Book(1, "Onepiece", "Oda")
    val b2 = Book(2, "Scala Programming", "Martin")

    Book(3, "Python", "SomeOne") match {
        case Book(1, _, _) => println("This is Onepiece")
        case Book(_, _, "Nartin") => println("This is scala book")
        case _ => println("not match")
    }

    case class Product(id: Int, price: Int)

    println(Product(2, 100) == Product(1, 100))
}