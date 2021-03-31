
object PlayETC extends App {
    //apply
    class Car(val year: Int)
    object Car{
        def apply(year: Int) = new Car(year)
    }

    println(Car(2000).year)
    println(Car.apply(1992).year)

    // algorithm
    // *
    def display(arr: Int*) = arr.foreach(println)
    display(arr = 10, 20, 30)

    println("*")

    val arr = Array.tabulate(4)(x=>"*"*(x+1)) // x is index
    arr.foreach(println)

    for ( item <- arr) println(item)

    for (i <- 1 to 4){
        println("*"*i)
    }

    //collection: sequence (array, list), set, map
    val seq1: Seq[Int] = Seq(10, 20, 30)
    seq1.foreach(println)

    val set1: Set[Int] = Set(1,1,2)
    set1.foreach{
        x => println(x)
    }

    val list = List("apple", "banana")
    val list2 = list.flatMap(_.toUpperCase())
    println(list2)

    println(List(List(1, 2), List(3, 4)).flatten)

    val lst = List(1, 2, 6).map(x => "*" * x)
    println(lst)

    val lst1 = List(1, 2, 6).map("*" * _)
    lst1.foreach(println)
}