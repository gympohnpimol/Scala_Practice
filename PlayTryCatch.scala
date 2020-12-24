object PlayTryCatch extends App{

    val str = "123"
    val num = try{
        str.toInt
    } catch {
        case ex: NumberFormatException => {
            println(ex)
            0
        }
        case ex:Exception => {
            println(ex)
            1
        }
    }
    println(num)
}

