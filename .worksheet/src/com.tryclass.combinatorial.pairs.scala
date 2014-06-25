package com.tryclass.combinatorial

object pairs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  var n = 7;System.out.println("""n  : Int = """ + $show(n ));$skip(55); val res$0 = 
  (1 until n) map (i => (1 until i) map (j => (i, j)));System.out.println("""res0: scala.collection.immutable.IndexedSeq[scala.collection.immutable.IndexedSeq[(Int, Int)]] = """ + $show(res$0));$skip(104); val res$1 = 

  //(xss foldRight Seq[Int]())(_++_)

  ((1 until n) map (i => (1 until i) map (j => (i, j)))).flatten;System.out.println("""res1: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$1));$skip(57); 

  def isPrime(n: Int) = (2 until n) forall (n % _ != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(98); val res$2 = 

  //xs flatmap f = (xs map f).flatten
  (1 until n) flatMap (i => (1 until i) map (j => (i, j)));System.out.println("""res2: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$2));$skip(107); val res$3 = 
  (1 until n) flatMap (i => (1 until i) map (j => (i, j))) filter (pair =>
    isPrime(pair._1 + pair._2));System.out.println("""res3: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$3));$skip(86); val res$4 = 

  for {
    i <- 1 until n
    j <- 1 until i
    if isPrime(i + j)
  } yield (i, j);System.out.println("""res4: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$4));$skip(116); 
 
  def scalarProduct(xs: List[Double], ys: List[Double]): Double =
    (for ((x, y) <- xs zip ys) yield x * y).sum;System.out.println("""scalarProduct: (xs: List[Double], ys: List[Double])Double""")}
}
