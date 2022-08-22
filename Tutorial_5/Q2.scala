import scala.io.StdIn._
import scala.util.control.Breaks._

object Q2 extends App{

  def gcd(a:Int,b:Int):Int=b match{
    case 0=>a
    case b if(b>a) =>gcd(b,a)
    case _ =>gcd(b,a%b)
  }

  def Prime(n:Int,i:Int):Boolean= n match{
    case n if n==i => true

    case n if gcd(n,i)>1 => false

    case x  =>Prime(n,i+1)

  }

  def printSeq(n:Int,i:Int){
    if(n==i) {
      break
    }

    if(Prime(i,2)){
      println(i)
    }

    printSeq(n,i+1)

  }
  print("Number : ")
  var n=readInt()

  printSeq(n,2)

}
