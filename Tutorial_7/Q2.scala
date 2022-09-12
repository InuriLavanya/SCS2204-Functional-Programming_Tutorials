object Q2 extends App {
  val x = new Rational_2(3,4)
  val y = new Rational_2(5,8)
  val z = new Rational_2(2,7)

  val a = x-y-z

  println(a)
}

class Rational_2(n:Int, d:Int) {
  require(denom > 0, "Denominator must be greater than 0")
  def numer = n
  def denom = d
  def neg = new Rational_2(-this.numer, this.denom)
  def add(r:Rational_2) = new Rational_2(this.numer*r.denom + this.denom*r.numer, this.denom*r.denom)
  def -(r:Rational_2) = this.add(r.neg)

  override def toString(): String = numer + "/" + denom
}