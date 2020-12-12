object PlayLoop extends App{

    for (i <- 1 to 10 if i%2==0){
        println(i)
    }
  
    val v = for(i <- 1 to 5 if i%2==0) yield{
        i
    }
    println(v)

    val  x = for {
        i <- 1 to 2
        j <- i to 3
    } yield {
        println(s"i= $i, j= $j" )
        i*j
    }
    println(x)
    x.foreach(println)

    var i = 0
    while(i < 2){
        println(i)
        i += 1
    }

    //do while
    i = 0
    do {
        println(i)
        i += 1
    } while(i < 2)
}
