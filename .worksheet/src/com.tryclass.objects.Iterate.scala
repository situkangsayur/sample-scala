package com.tryclass.objects

object Iterate {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  val xs = Array(1, 2, 3, 44);System.out.println("""xs  : Array[Int] = """ + $show(xs ));$skip(22); val res$0 = 
  xs map (x => x * 2);System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(25); 

  val s = "Hello World";System.out.println("""s  : String = """ + $show(s ));$skip(29); val res$1 = 

  s filter (c => c.isUpper);System.out.println("""res1: String = """ + $show(res$1));$skip(29); val res$2 = 

  s exists (c => c.isUpper);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(28); val res$3 = 
  s forall (c => c.isUpper);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(35); 

  val pairs = List(1, 2, 3) zip s;System.out.println("""pairs  : List[(Int, Char)] = """ + $show(pairs ));$skip(15); val res$4 = 

  pairs.unzip;System.out.println("""res4: (List[Int], List[Char]) = """ + $show(res$4));$skip(33); val res$5 = 

  s flatMap (c => List('.', c));System.out.println("""res5: String = """ + $show(res$5));$skip(9); val res$6 = 
  xs sum;System.out.println("""res6: Int = """ + $show(res$6));$skip(118); 
  
  def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
    (xs zip ys).map(xy => xy._1 * xy._2).sum;System.out.println("""scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double""");$skip(118); 
  
  def scalarProductPM(xs: Vector[Double], ys: Vector[Double]): Double =
    (xs zip ys).map{case (x,y) => x*y}.sum;System.out.println("""scalarProductPM: (xs: Vector[Double], ys: Vector[Double])Double""");$skip(79); 
    
  def isPrime(n: Int): Boolean =
  	(2 until n) forall ( d =>	n % d  !=0);System.out.println("""isPrime: (n: Int)Boolean""")}
  
}
