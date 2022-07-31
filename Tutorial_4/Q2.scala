object Q4 extends App{
  def PatternMatch(value: Int) = value match {
    case x if x < 0 => "Negative Value"
    case x if x == 0 => "Zero"
    case x if x > 0 && (x%2 == 0)=> "Even"
    case x if x > 0 && (x%2 == 1)=> "Odd"
  }
  print("Enter a value: ")
  var v = scala.io.StdIn.readInt();
  println(PatternMatch(v))
}
