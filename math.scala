// recursive
object Factorial extends App{
    def fac(n: Int): Int = {
        if (n<=1){
            1
        }
        else{
            n * fac(n-1)
        }

    }
    println(fac(n=3))
}

// prime

object Findprime extends App{
    def isPrime(n: Int): Boolean = {
        if (n >= 2) {
            var prime = true
            for (i <- 2 to n-1 ){
                if (n%i == 0)
                    prime = false
            }
            prime
        }
        else
            false
    }
    //println(3 + " " + isPrime(n=3))
    var input = 6
    var c = 0
    var x = 1
    while (c < input){
        if (isPrime(x)){
            c += 1
            print(x + " ")
        }
        x += 1
    }
}