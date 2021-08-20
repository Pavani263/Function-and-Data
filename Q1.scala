object Q1 extends App {
    val r1 = new Rational(1,2)
    val r2 = new Rational(5,8)
    println(r1.neg)            //r1.neg evaluares to -r1
    println(r2.neg)            //r2.neg evaluares to -r2
}

class Rational(n:Int, d:Int) {
    require(denom > 0, "Denominator must be greater than 0")
    def numer = n
    def denom = d

   
    def neg = new Rational(-this.numer, this.denom)

    override def toString(): String = numer + "/" + denom
}