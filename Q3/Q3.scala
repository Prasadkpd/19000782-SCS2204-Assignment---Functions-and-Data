//19000782
//K.P.D.P. Lakshan
//Q3
//Implement a Data Structure for Account and create a method transfer which transfer the money from this account to a given account.

object Q3 extends App{

	val acc1= new Bankacc("Prasad",12345,9000.00)
	val acc2= new Bankacc("Lakshan",23456,2000.00)

  acc1.transfer(acc2,5000.00)

  println(acc1)
  println(acc2)


}

class Bankacc(id:String,n:Int,b:Double){

  var nic:String=id
  var accnumber:Int =n
  var balance:Double =b

	def withdraw(n:Double){
		this.balance=this.balance-n
	}

	def deposit(n:Double){
		this.balance=this.balance+n
	}

	def transfer(acc:Bankacc,n:Double)={
    this.withdraw(n)
    acc.deposit(n)
  }

  override def toString = "["+nic+":"+accnumber+":"+balance+"]"

	}
