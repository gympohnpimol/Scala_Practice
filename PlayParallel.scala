import scala.collection.parallel.ParSeq
object PlayParallel extends App {

    val capacity = 10000
    val seq = 1 to capacity //serial 
    val parSeq = ParSeq.tabulate(capacity)(i=>1) //parallel

    println(seq.size)
    println(parSeq.size)
    seq.foreach(i => print(s"$i, "))
    println()
    parSeq.foreach(i => print(s"$i, "))

    def measure[T](operation: => T): Long = {
        val time = System.currentTimeMillis()
        operation
        System.currentTimeMillis() - time
    }
    val serialTime = measure{
        seq.map(_ + 1)
    }

    val parallelTime = measure{
    parseq.map(_ + 1)
    }

    println(s"serialTime = $serialTime")
    println(s"parallelime = $parallelime")
}