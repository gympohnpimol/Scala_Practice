object PlayGeneric extends App {
    class MyList[T](value: T) {
        println("inside myList")

        def showValue: Any = {
            if (value.isInstanceOf[Int]){
                println("This is Int")
            }
            else if (value.isInstanceOf[String]){
                println("This is String")
            }
            else {
                println("unknown")
            }
        }
    }

    val intList = new MyList[Int](value = 100)
    val stringList = new MyList[String](value = "hello")
    val doubleList = new MyList[Double](value = 10.50)

    intList.showValue
    stringList.showValue
    doubleList.showValue

    //companion object
    object MyList {
        def apply[T](value: T): MyList[T] = new MyList(value)
    }
    MyList.apply(1000)
    MyList.apply("hi").showValue

    class Book
    object Book {
        def apply: Book = new Book()
    }

    val b = Book.apply // b is instance of class book
}