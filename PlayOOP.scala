object PlayOOP extends App{
    class Car (var year:Int, var model:String){

        println("start constructor " + year )

        private val machine:String = "motor"
        def run(distance: Int): Unit = {
            print("this car is running around "+ distance+ " km." )
        }

        def fill(l: Int): Unit = {
            println("We have filled oil in " + l + " liters")
        }

        println("end")
    }

    val car1 = new Car(2010, "BENZ")
    println(car1.model + " "+car1.year)
    car1.run(distance = 1000)

    val car2 = new Car(2020, "BMW")

    abstract class Animal{
        def eat
        def walk
    }
    class Cat(val name: String) extends Animal{
        override def eat: Unit = println(name+" is eating") 
        override def walk: Unit = println(name+" is walking")
    }
    class Dog extends Animal{
        override def eat: Unit = println("Dog is eating") 
        override def walk: Unit = println("Dog is walking")
    }
    class Human {
        def eat: Unit = println("Human can eat: ")
        def work: Unit = println("Human has to work")
    }

    class ModernHuman(val name: String) extends Human with Doctor with Programmer{
        override def work: Unit = {
            super.work
            println("Modern human can work smarter than human")
        }
        override def Heal: Unit = println(name + " can heal")
        override def writeCode: Unit = println(name + " can code")
    }
    
    val cat1 = new Cat(name= "Susan")
    cat1.eat
    cat1.walk
    val dog1 = new Dog
    dog1.eat

    trait Doctor{
        def Heal: Unit = println("Doctor likes healing")
    }

    trait Programmer {
        def writeCode: Unit = println("Programmer likes coding")
    }

    val m1 = new ModernHuman(name = "gym")
    m1.work
    m1.Heal
    m1.writeCode

}