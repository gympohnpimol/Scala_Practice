object LCM_GCD extends App{

    def getLCM(arr: Seq[Int]): Int = {
        var s = arr.max
        var found = false
        while (!found) {
            if (arr.forall(s%_==0)){
                found = true
            }
            else {
                s += 1
            }
        }
        s
    }

    def getGCD(arr: Seq[Int]): Int = {
        var s = arr.max
        var found = false
        while(!found){
            if (arr.forall(_ % s == 0)){
                found = true
            }
            else {
                s -= 1
            }
        }
        s
    }

    println("input number: ")
    val n = io.StdIn.readInt()
    var arr: Seq[Int] = Seq.empty
    for (i <- to n){
        print(s"input #$i: ")
        arr = arr :+ io.StdIn.readInt()
    }
    println(s"lcm = "+ getLCM(arr))
    println(s"gcd = "+ getGCD(arr))
}