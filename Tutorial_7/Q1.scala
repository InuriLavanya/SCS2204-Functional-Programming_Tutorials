object Q1 extends App{
  val a = new Rational(2,7)

  println(a.neg);
}

class Rational(x:Int, y:Int){
  def numer = x
  def denumer = y

  def neg = new Rational(-this.x, this.y)

  override def toString: String = numer + "/" + denumer
}

