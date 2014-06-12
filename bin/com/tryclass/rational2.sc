package com.tryclass

object rational2 {
  val x = new Rationals2(1, 3)                    //> x  : com.tryclass.Rationals2 = 1/3
  val y = new Rationals2(5, 7)                    //> y  : com.tryclass.Rationals2 = 5/7
  val z = new Rationals2(3, 2)                    //> z  : com.tryclass.Rationals2 = 3/2
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3
  x.add(y)                                        //> res2: com.tryclass.Rationals2 = 22/21
  x.sub(y).sub(z)                                 //> res3: com.tryclass.Rationals2 = -79/42
  y.add(y)                                        //> res4: com.tryclass.Rationals2 = 10/7
  x.less(y)                                       //> res5: Boolean = true
  x.max(y)                                        //> res6: com.tryclass.Rationals2 = 5/7
  new Rationals2(2)                               //> res7: com.tryclass.Rationals2 = 2/1
}

class Rationals2(x: Int, y: Int) {
  require(y != 0, "denominator must be nonzero")

	def this(x:Int) = this(x,1)
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def numer = x
  def denom = y

  def less(that: Rationals2) = numer * that.denom < that.numer * denom

  def max(that: Rationals2) = if (this.less(that)) that else this

  def add(that: Rationals2) =
    new Rationals2(
      numer * that.denom + that.numer * denom, denom * that.denom)

  def neg: Rationals2 = new Rationals2(-numer, denom)

  def sub(that: Rationals2) = add(that.neg)

  override def toString = {
  	val g = gcd(numer, denom)
    numer/g + "/" + denom/g
  }
}