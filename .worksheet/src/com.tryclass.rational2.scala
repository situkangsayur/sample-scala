package com.tryclass

object rational2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(71); 
  val x = new Rationals2(1, 3);System.out.println("""x  : com.tryclass.Rationals2 = """ + $show(x ));$skip(31); 
  val y = new Rationals2(5, 7);System.out.println("""y  : com.tryclass.Rationals2 = """ + $show(y ));$skip(31); 
  val z = new Rationals2(3, 2);System.out.println("""z  : com.tryclass.Rationals2 = """ + $show(z ));$skip(10); val res$0 = 
  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(11); val res$2 = 
  x.add(y);System.out.println("""res2: com.tryclass.Rationals2 = """ + $show(res$2));$skip(18); val res$3 = 
  x.sub(y).sub(z);System.out.println("""res3: com.tryclass.Rationals2 = """ + $show(res$3));$skip(11); val res$4 = 
  y.add(y);System.out.println("""res4: com.tryclass.Rationals2 = """ + $show(res$4));$skip(12); val res$5 = 
  x.less(y);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(11); val res$6 = 
  x.max(y);System.out.println("""res6: com.tryclass.Rationals2 = """ + $show(res$6));$skip(20); val res$7 = 
  new Rationals2(2);System.out.println("""res7: com.tryclass.Rationals2 = """ + $show(res$7))}
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
