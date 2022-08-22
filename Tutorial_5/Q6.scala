import scala.io.StdIn._
import scala.util.control.Breaks._

object Q6 extends App{
  def fib(n:Int):Int={

    if(n<=1)
      n
    else
      fib(n-1)+fib(n-2)

  }

  def Fibonacci(n:Int,i:Int){

    if(n==i)
      break
    else
      println(fib(i))
    Fibonacci(n,i+1)

  }
  print("Number : ")
  var n=readInt()

  Fibonacci(n,0)

}
