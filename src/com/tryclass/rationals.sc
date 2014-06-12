package com.tryclass

object rationals {
  val x = new Rational(1, 3)                      //> x  : com.tryclass.Rational = 1/3
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3

  val y = new Rational(5, 7)                      //> y  : com.tryclass.Rational = 5/7
  val z = new Rational(3, 2)                      //> z  : com.tryclass.Rational = 3/2
  x.add(y)                                        //> res2: com.tryclass.Rational = 22/21
  x.denom                                         //> res3: Int = 3
  x.sub(y).sub(z)                                 //> res4: com.tryclass.Rational = -79/42
  y.add(y)                                        //> res5: com.tryclass.Rational = 10/7
  x.less(y)                                       //> res6: Boolean = true
  x.max(y)                                        //> res7: com.tryclass.Rational = 5/7
}

class Rational(x: Int, y: Int) {
	require(y != 0, "denominator must be nonzero")
	
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)
  def numer = x / g
  def denom = y / g
  
  def less(that: Rational) = numer * that.denom < that.numer * denom
  
  def max(that: Rational) = if (this.less(that)) that else this

  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom, denom * that.denom)

  def neg: Rational = new Rational(-numer, denom)

  def sub(that: Rational) = add(that.neg)

  override def toString = numer + "/" + denom
}