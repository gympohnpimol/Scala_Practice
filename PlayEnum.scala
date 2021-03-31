object PlayEnum extends App {

    object WeekDay extends Enumeration {
        type WeekDay = Value
        val Sun, Mon, Tue, Wed, Thu, Fri, Sat = Value
    }

    def isWorkingDay(day: WeekDay): Boolean = !(day == WeekDay.Sat || day == WeekDay.Sun)

    val day: WeekDay = WeekDay.Mon
    if (isWorkingDay(day)){
        println("working...")
    }
    else{
        println("WeekEnd")
    }

}