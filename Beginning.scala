
object Hello{
    def main (args: Array[String]): Unit = {
        println("Hello World")
    }
}

object  Valuevar extends App {
    // value, variable, data type
    val i: Int = 10
    val s: String = "Hello"
    val b: Boolean = true
    val amount: Double = 20.55
    val c: Char = 'A'
    val f: Float = 10.23f

    var j: Int = 20
    j = 25 
}

object Ifelse extends App {
    val k: Int = 10
    if (k==1){
        println("Yes k=10")
    }
    else{
        println(s"Noooo! k = $k")
    }

    val a = if (k == 1) 5 else 20
    println(s"a = $a")
}

object  Mathoperation extends App{
    val pi = math.Pi
    println("%1.2f".format(pi))
    println(f"$pi%1.3f")

    val y = 10.567
    println("%3.2f".format(y))
}