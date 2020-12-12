object PlayMatch extends App{

    // pattern matching
    val i = 5
    (i) match {
        case(10) => println("Yeah i=10")
        case(2) => println("not 10")
        case _ =>
    }

    val t = (10, "Name") //tuple
    println(t._1 + " " + t._2)

    (t) match {
        case(_, "") => println("case 2")
        case (10, _) => println("number and something")
        case(_, "Name") => println("case3")
        case _ => println("case4")
    }

    val fb = for(i <- 1 to 20) yield{
        (i%3, i%5) match {
            case(0, 0) => i+"fizzbuzz"
            case(0, _) => i+"fizz"
            case(_, 0) => i+"buzz"
            case(_, _) => i+" "
        }
    } 
    println(fb)
}
