//19000782
//K.P.D.P. Lakshan
//Q1
// Implement a Data Structure for Rational Number and create a method neg to class Rational that is used like this: x.neg// evaluates to -x

object Q1 extends App{

	val r1= new Rational(5,10)
	val r=r1.neg
	println(r)

}

class Rational(n:Int, d:Int){

	def numer=n
	def denom=d
	def neg=new Rational(-this.numer,this.denom)

	override def toString=numer+"/"+denom
}
