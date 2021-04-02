
import scala.concurrent.{Future, Await}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.Promise

object PlayFutureAndPromise extends App{
    val f = Future {
        println("print this text in near future")
    }
    Thread.sleep(100)
    Await.result(f, 1.seconds)

    println("hi")

    val myFuture = Future {
        100
    }
    myFuture.onComplete{
        case util.Success(value) => println("success value = "+value)
        case util.Failure(exception) => exception match {
            case ex:Exception => println("got exception")
        }
    }
    Thread.sleep(1700)

    val f1 = Future {
        3
    }

    val f2 = Future {
        6
    }
    // for comprehensive
    val sunFuture = for {
        a <- f1
        b <- f2
    } yield a + b // future[Int]

    sunFuture.onComplete{
        case util.Success(value) => println("sum= "+value)
        case util.Failure(ex) =>
    }
    Thread.sleep(100)

    val promise = Promise[Int]()
    //main thread
    promise.future.onComplete{
        case util.Success(value) => println("promise future success: "+value)
        case util.Failure(ex) =>
    }

    new Thread(() => {
        println("ferching the number...")
        Thread.sleep(200)
        promise.success(99)

        println("done")
    }).start()
}