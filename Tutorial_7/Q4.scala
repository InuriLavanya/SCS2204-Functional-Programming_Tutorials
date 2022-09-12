object Q4 extends App {

  val account1= new BankAccount1("a",22275100,1500.00)
  val account2= new BankAccount1("b",32478470,-570.00)
  val account3= new BankAccount1("c",12030520,11890.00)
  val account4= new BankAccount1("d",12040200,-3070.00)

  var bank:List[BankAccount1]=List(account1,account2,account3,account4)

  val negbalance = bank.filter(a=>a.balance<0)
  val totbalance = bank.map((a)=>(a.balance)).reduce((a,b)=>(a+b))
  val interest = (b:List[BankAccount1])=>b.map((a) => (a.ID,a.accountnumber,if(a.balance>0)  (a.balance+(a.balance*0.5)) else (a.balance+(a.balance*0.1)) ))

  print("\nAccounts with negative balance: ")
  println(negbalance)
  print("\nSum of all account balances: ")
  println(totbalance)
  print("\nFinal balances with interest: ")
  println(interest(bank))

}

class BankAccount1(id:String,n:Int,b:Double){

  var ID:String=id
  var accountnumber:Int =n
  var balance:Double =b

  override def toString = "["+ID+":"+accountnumber+":"+balance+"]"


}

