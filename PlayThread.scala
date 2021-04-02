import java.util.concurrent.Executor

object PlayThread extends App {
    val runnable = new Runnable {
        override def run(): Unit = println("in parallel: " + Thread.currentThread().getName)
    }

    val t0 = new Thread(runnable)
    val t1 = new Thread(runnable)
    t0.start()
    t1.start()

    // t0.join() // waiting until t0 finish working
    // println("after t0.join")

    val t2 = new Thread(() => {
        println("inside t2")
    })
    t2.start()

    // thread pool
    val pool = Executors.newFixedThreadPool(3)
    // newFixedThreadPool(nThreads=3)
    pool.execute(() => {
        println("inside pool1")
    })

    pool.execute(() => {
        println("inside pool2")
    })

    pool.execute(() => {
        Thread.sleep(millis=1000)
        println("inside pool3")
    })
    pool.shutdown()
    println(pool.isShutdown)

    class BankAccount(var amount:Int){
        override def toString: String = ""+amount
    }

    val bankAccount = new BankAccount(amount = 5000)
    val thread1 = new Thread(() => {bankAccount.amount -= 200})
    val thread2 = new Thread(() => {bankAccount.amount -= 100})
    thread1.start()
    thread2.start()
    thread1.join(100)
    thread2.join(100)
    println(bankAccount)

}