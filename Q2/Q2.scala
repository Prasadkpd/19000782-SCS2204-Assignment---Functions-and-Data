//19000782
//K.P.D.P. Lakshan
//Q2
//Create a method sub to subtract two rational numbers and find an answer  x-y-z where x=3/4, y=5/8, z=2/7.

object Q2 extends App{

	val x= new Rational(3,4)
	val y= new Rational(5,8)
	val z= new Rational(2,7)
	val r=x-y-z

	println(r)

}

class Rational(n:Int, d:Int){

	def numer=n/gcd(Math.abs(n),d)
	def denom=d/gcd(Math.abs(n),d)

	private def gcd(a:Int, b:Int) :Int= if(b==0) a else gcd(b,a%b)

	def +(r:Rational)=new Rational(this.numer*r.denom+this.denom*r.numer,this.denom*r.denom)

	def -(r:Rational)=new Rational(this.numer*r.denom-this.denom*r.numer,this.denom*r.denom)

	override def toString=numer+"/"+denom

}
