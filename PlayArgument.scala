object  PlayArgument {
  def main(args: Array[String]): Unit = {

    println(args.length)
    for (a <- args){
        println(a)
    }

    // standard input: keyboard
    print("input name: ")
    val name = io.StdIn.readLine()
    print("input number: ")
    val number = io.StdIn.readInt()
    println(s"hello $name, your number is $number")

    print("input radius: ")
    val r = io.StdIn.readDouble()
    println(f"circle's area is ${math.Pi*r*r}%2.2f")
    println(f"${2 * math.Pi * r }%2.2f")
  }
}
