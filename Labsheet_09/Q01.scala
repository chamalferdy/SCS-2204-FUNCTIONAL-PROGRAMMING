class Rational(x:Int,y:Int){
    def numer = x
    def denom = y
    def sub(r:Rational) = new Rational(numer*r.denom - r.numer*denom, denom*r.denom)
    override def toString(): String = numer + "/" + denom
}

def main(args: Array[String]): Unit = {
    
}

def +(r:Rational) = new Rational(this.numer * r.denom + r.numer * this.denom , denom * r.denom) 