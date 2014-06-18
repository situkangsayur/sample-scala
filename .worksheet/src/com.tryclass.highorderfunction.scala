package com.tryclass

object highorderfunction {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(204); 
  def scaleList(xs: List[Double], factor: Double): List[Double] = xs match {
    case Nil => xs
    case y :: ys => y * factor :: scaleList(ys, factor)
  };System.out.println("""scaleList: (xs: List[Double], factor: Double)List[Double]""");$skip(131); 

  def squareListSec(xs: List[Int]): List[Int] = xs match {
    case Nil => Nil
    case y :: ys => y * y :: squareListSec(ys)
  };System.out.println("""squareListSec: (xs: List[Int])List[Int]""");$skip(73); 

  def squareListMap(xs: List[Int]): List[Int] =
    xs map (x => x * x);System.out.println("""squareListMap: (xs: List[Int])List[Int]""");$skip(145); 

  def posElems(xs: List[Int]): List[Int] = xs match {
    case Nil => xs
    case y :: ys => if (y > 0) y :: posElems(ys) else posElems(ys)
  };System.out.println("""posElems: (xs: List[Int])List[Int]""");$skip(36); 

  val nums = List(2, 10, 4, 8, 12);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(54); 
  val numsOther = List(2, 0, -2, 0, -1, 10, 4, 8, 12);System.out.println("""numsOther  : List[Int] = """ + $show(numsOther ));$skip(54); 

  val data = List("a", "a", "a", "b", "c", "c", "a");System.out.println("""data  : List[String] = """ + $show(data ));$skip(33); val res$0 = 

  numsOther filter (x => x > 0);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(35); val res$1 = 
  numsOther filterNot (x => x > 0);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(35); val res$2 = 
  numsOther partition (x => x > 0);System.out.println("""res2: (List[Int], List[Int]) = """ + $show(res$2));$skip(35); val res$3 = 
  numsOther takeWhile (x => x > 0);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(35); val res$4 = 
  numsOther dropWhile (x => x > 0);System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(30); val res$5 = 
  numsOther span (x => x > 0);System.out.println("""res5: (List[Int], List[Int]) = """ + $show(res$5));$skip(23); val res$6 = 

  squareListSec(nums);System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(22); val res$7 = 
  squareListMap(nums);System.out.println("""res7: List[Int] = """ + $show(res$7));$skip(175); 

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, rest) = xs span (y => y == x)
      first :: pack(rest)
  };System.out.println("""pack: [T](xs: List[T])List[List[T]]""");$skip(94); 

  def encode[T](xs: List[T]): List[(T, Int)] =
    pack(xs) map (ys => (ys.head, ys.length));System.out.println("""encode: [T](xs: List[T])List[(T, Int)]""");$skip(110); 

  def sumManual(xs: List[Int]): Int = xs match {
    case Nil => 0
    case y :: ys => y + sumManual(ys)
  };System.out.println("""sumManual: (xs: List[Int])Int""");$skip(73); 

  def sumReduce(xs: List[Int]) = (0 :: xs) reduceLeft ((x, y) => x + y);System.out.println("""sumReduce: (xs: List[Int])Int""");$skip(76); 
  def productReduce(xs: List[Int]) = (0 :: xs) reduceLeft ((x, y) => x * y);System.out.println("""productReduce: (xs: List[Int])Int""");$skip(54); 
  def sumFold(xs: List[Int]) = (xs foldLeft 0)(_ + _);System.out.println("""sumFold: (xs: List[Int])Int""");$skip(58); 
  def productFold(xs: List[Int]) = (xs foldLeft 1)(_ * _);System.out.println("""productFold: (xs: List[Int])Int""");$skip(82); 
	
	def concat[T](xs: List[T], ys: List[T]): List[T] =
		(xs foldRight ys)(_ :: _);System.out.println("""concat: [T](xs: List[T], ys: List[T])List[T]""");$skip(16); val res$8 = 

	sumFold(nums);System.out.println("""res8: Int = """ + $show(res$8));$skip(19); val res$9 = 
	productFold(nums);System.out.println("""res9: Int = """ + $show(res$9));$skip(13); val res$10 = 
  pack(data);System.out.println("""res10: List[List[String]] = """ + $show(res$10));$skip(15); val res$11 = 
  encode(data);System.out.println("""res11: List[(String, Int)] = """ + $show(res$11))}

}
