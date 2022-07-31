object Q5 extends App{
  def toupper(name1:String): Unit ={
    var n = name1;
    var u = n.toUpperCase()
    println(u)
  }

  def tolower(name2: String): Unit = {
    var n = name2;
    var u = n.toLowerCase()
    println(u)
  }

  def formatNames(name3:String): Unit ={
    print("Position of the word you want to capitalize:")
    var pos = scala.io.StdIn.readInt()
    println(name3.replace(name3(pos-1),name3(pos-1).toUpper))
  }

  print("\nSelect a number of the method you required to do: \n\t1.convert to upper case\n\t2.convert to lower case\n\t3.convert to any format you required")
  print("\nYour choice: ")
  var c = scala.io.StdIn.readInt();
  print("Enter a name: ");
  var name = scala.io.StdIn.readLine();

  if(c==1){
    toupper(name);
  }
  else if(c==2){
    tolower(name);
  }
  else if(c==3){
    formatNames(name);
  }
  else{
    println("Enter a correct number!!")
  }
}
