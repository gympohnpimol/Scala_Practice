
object WaitAndNotify extends App{
    class SimpleContainer {
        private var value:Int = 0
        def isEmpty: Boolean = value == 0
        def get: Int = {
            val result = value
            value = 0
            result
        }
        def set(newValue: Int): Unit = {
            value = newValue
        }
    }
    val container = new SimpleContainer
    val consumer = new Thread(() => {
        println("customer is waiting...")
        container.synchronized(
            container.wait() // until ger notify
        )
        println("consumer consumed: "+container.get)
    })

    val producer = new Thread(() => {
        println("prodicer is working...")
        Thread.sleep(100)
        val x = 100
        container.synchronized{
            println("in producer, container isEmpty: "+container.isEmpty)
            println("producer has produced "+container.set(x))
            container.notify()
        }
    })
    consumer.start()

    val q = new mutable.Queue[Int]()
    val capacity = 3
    val r = new util.Random()

    val consumer = new Thread(() => {
        while(true) {
            q.synchronized{
                if (q.isEmpty){
                    println("[cinsumer] q is empty, waiting producer...")
                    q.wait()
                }
                val value = q.dequeue()
                println("[consi¥umer] consumed "+value)
                q.notify()
            }
            Thread.sleep(r.nextInt(500))
        }
    })
    val producer = new Thread(() => {
        var i:Int = 0
        while(true){
            q.synchronized{
            if (q.size == capacity){
                println("[producer] q is full, waiting consumer")
                q.wait()
            }
            // q is not full
            q.enqueue()
            q.enqueue("[producer] produced "+ i)
            i += 1

            q.notify() //new food for you
        }
        Thread.sleep(r.nextInt(500))
    }
    })
    consumer.start()
    producer.start()

    val bell = new Object // sharing object
    (1 to 5).foreach(i => {
        new Thread(() => {
            bell.synchronized{
                println(s"thread $i is waiting....")
                bell.wait()
            }
            println(s"thread $i is yeahhhhhh")
        }).start()
    })
    new Thread(() => {
        Thread.sleep(3000)
        bell.synchronized{
            bell.notifyAll()
        }
    }).start()
}