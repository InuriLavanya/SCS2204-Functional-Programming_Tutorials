import scala.io.StdIn._

object Q1 extends App {

  def Encryption(x:String) = {
    val outputText = inputText.map((c: Char) => {
      val x = alphabet.indexOf(c.toUpper)
      if (x == -1) {
        c
      }
      else {
        alphabet((x + shift) % alphabet.size)
      }
    });
    println(outputText)
  }

  def Decryption(x: String) = {
    val outputText = inputText.map((c: Char) => {
      val x = alphabet.indexOf(c.toUpper)
      if (x == -1) {
        c
      }
      else {
        alphabet((x - shift) % alphabet.size)
      }
    });
    println(outputText)
  }

  def Cipher(x: String) = {
    print("\nSelect a number of the method you required to do: \n\t1.Encrypt\n\t2.Decrypt")
    print("\nYour choice: ")
    var c = scala.io.StdIn.readInt();

    if (c == 1) {
      Encryption(inputText)
    }
    else if(c==2){
      Decryption(inputText)
    }
  }

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size
  val inputText = scala.io.StdIn.readLine("Secret Message: ")

  Cipher(inputText)


}
