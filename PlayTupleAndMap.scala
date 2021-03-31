object PlayTupleAndMap extends App {
    // tuple
    val t1 = (10, "Name1", "LastName1")
    println(t1._1)
    println(t1._2)

    val t2 = t1.copy(_2 = "Name2")
    print(t2._2)

    // map
    val dict:Map[Int, String] = Map((1, "One"), 2 -> "Two")
    println(dict)
    println(dict.keys)

    dict.values.foreach(println)

    val newPair = (3, "Three")
    val newDict = dict + newPair
    println(newDict.contains(3))
    println(newDict)
    println(newDict(3))

    println(newDict.toList)

    val phonebook:Map[String, Int] = Map("Gym" -> 1111, "Yo" -> 2222)
    
}