object Q1 extends App{
  def Interest(amount: Double) = amount match {
    case x if x <= 20000 => x * 2 / 100
    case x if x <= 200000 => x * 4 / 100
    case x if x <= 2000000 => x * 3.5 / 100
    case x if x > 2000000 => x * 6.5 / 100
  }
  print("Enter the amount: ");
  var amount = scala.io.StdIn.readDouble();
  println("Interest = " + Interest(amount));
}

