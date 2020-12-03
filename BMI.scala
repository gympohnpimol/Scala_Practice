
object Body extends App{
    print("Input weight: ")
    val w = io.StdIn.readInt()

    print("Input height: ")
    val h = io.StdIn.readDouble()

    var bmi = w/math.pow(h,2)
    println("%2.1f".format(bmi))

    if (bmi >= 30.0){
        println("Obese")
    }
    else if (bmi >= 25.0 && bmi <= 29.9){
        println("Overweight")
    }
    else if (bmi >= 18.5 && bmi <= 23.9){
        println("Normal")
    }
    else if (bmi < 18.5){
        println("Underweight")
    }
}


