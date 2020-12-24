import scala.io.Source
object PlaySome extends App{

    val a = Array(10, 20).sum
    println(a)

    def mySum(list: List[Int]) : Int = {
        var sum = 0
        for (i <- list){
            sum += i
        }

        sum
    }
    def mySum2(list: List[Int]) : Int = {
        list match{
            case Nil => 0
            case x :: tail => x + mySum2(tail)
        }
    }
    val b = mySum2(List(20, 30, 40))
    println(b)

    val src = scala.io.Source.fromFile("metrix.txt")
    val lines =  src.getLines()
    val rowSums = lines.map( line => line.split(reqex = " ").map( str => str.toDouble).sum) // 2 3 => 2, 3
    rowSums.foreach(println)


    val pw = new PrintWriter(filename = "output.txt")
    rowSums.foreach( row => pw.println(row))
    pw.close()
    

}
