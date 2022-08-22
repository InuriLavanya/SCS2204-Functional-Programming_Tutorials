import scala.io.StdIn._

object Q4 extends App{
  def odd_or_even(n:Int):String = {
    if(n==0)
      "Even"
    else if(n==1)
      "Odd"
    else
      odd_or_even(n-2)
  }
  print("Enter a Number : ")
  var n = readInt()

  println(odd_or_even(n))
}
