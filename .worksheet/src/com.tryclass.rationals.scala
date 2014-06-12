package com.tryclass

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(69); 
  val x = new Rational(1, 3);System.out.println("""x  : com.tryclass.Rational = """ + $show(x ));$skip(10); val res$0 = 
  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(30); 

  val y = new Rational(5, 7);System.out.println("""y  : com.tryclass.Rational = """ + $show(y ));$skip(29); 
  val z = new Rational(3, 2);System.out.println("""z  : com.tryclass.Rational = """ + $show(z ));$skip(11); val res$2 = 
  x.add(y);System.out.println("""res2: com.tryclass.Rational = """ + $show(res$2));$skip(10); val res$3 = 
  x.denom;System.out.println("""res3: Int = """ + $show(res$3));$skip(18); val res$4 = 
  x.sub(y).sub(z);System.out.println("""res4: com.tryclass.Rational = """ + $show(res$4));$skip(11); val res$5 = 
  y.add(y);System.out.println("""res5: com.tryclass.Rational = """ + $show(res$5));$skip(12); val res$6 = 
  x.less(y);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(11); val res$7 = 
  x.max(y);System.out.println("""res7: com.tryclass.Rational = """ + $show(res$7))}
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
