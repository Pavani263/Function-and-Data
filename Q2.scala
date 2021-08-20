object Q2 extends App {
    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z = new Rational(2,7)
  
    val f = x-y-z
    
    println(f)
}

class Rational(n:Int, d:Int) {
    require(denom > 0, "Denominator must be greater than 0")

    def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b)
    def numer = n/gcd(Math.abs(n),d)
    def denom = d/gcd(Math.abs(n),d)

    def neg = new Rational(-this.numer, this.denom)
    def add(r:Rational) = new Rational(this.numer*r.denom + this.denom*r.numer, this.denom*r.denom)
    def -(r:Rational) = this.add(r.neg)

    override def toString(): String = numer + "/" + denom
}

