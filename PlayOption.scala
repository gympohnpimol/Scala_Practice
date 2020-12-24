object PlayOption extends App{

    val n: Option[Int] = Some(5)
    val n2: Option[Int] = None

    n2 match {
        case Some(i) => println(s"Found $i") 
        case None => println("Not Found")
      }

    println(n.getOrElse(0))
    println(n2.getOrElse(0))

    println( n.map(_ *2) )
    println( n2.map(_ *2) )

    // Filter
    val a = Array(10, 20, 30, 40)
    val b = a.filter(_ > 20)
    a.foreach(println)
    println(a.count(_ > 30))
    println(a.exists(_ > 20))
    println(a.count(_ %5 == 0))
    println(a.partition(_ >20))
}
