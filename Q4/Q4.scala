//19000782
//K.P.D.P. Lakshan
//Q4
//A Bank defines as List of Accounts. So implement the following functions
//List of Accounts with negative balances
//Calculate the sum of all account balances
//Calculate the final balances of all accounts after apply the interest function as fallows: If balance is positive, deposit interest is .05  and if balance is negative, overdraft interest is .1

object Q4 extends App{

  val acc1= new Bankacc("Hansana",12345,-2000.00)
  val acc2= new Bankacc("Dula",23456,-3000.00)
  val acc3= new Bankacc("Bashi",34567,10000.00)
  val acc4= new Bankacc("Bimsara",45678,3000.00)

  var bank:List[Bankacc]=List(acc1,acc2,acc3,acc4)

  val overdraft = bank.filter(x=>x.balance<0)
  val balance = bank.map((x)=>(x.balance)).reduce((x,y)=>(x+y))
  val interest = (b:List[Bankacc])=>b.map((x) => (x.nic,x.accnumber,if(x.balance>0)  (x.balance+(x.balance*0.5)) else (x.balance+(x.balance*0.1)) ))


  print("The accounts with negative balance:")
  println(overdraft)
  print("The sum of all accounts:")
  println(balance)
  print("The final balnce of all accounts:")
  println(interest(bank))

}

class Bankacc(id:String,n:Int,b:Double){

  var nic:String=id
  var accnumber:Int =n
  var balance:Double =b

  override def toString = "["+nic+":"+accnumber+":"+balance+"]"

}
