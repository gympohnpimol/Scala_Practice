object PlayString extends App{
    
    val s = "Hello World"
    val c = "P"
    println(s.take(3))
    println(s.substring(6, 8))
    println(s.slice(2, 8))
    println(s.concat(s" This is a book."))
    println(s.replace("l", "x"))
    println(s.toUpperCase())
    println(s.toLowerCase())
    println(s.length())
    println(s.indexOf("d"))
    println(s.contains("lo")) // true
    println(s.contains("ABC")) // false
    println(s.toList)
    println(s.toSeq.sorted)
    println(s.charAt(4))
    println(s.head)
    println(s.last)
    println(s.toArray)
    s.toArray.foreach(println)

    println(s.patch(5, "Oops", 0))
    println(s.patch(5, "POP", 1))
    println(s.patch(5, "POP", 2))

    val s2 = "12345 67890"
    println(s.zip(s2))
}
