package com.tryclass

object highorderfunction {
  def scaleList(xs: List[Double], factor: Double): List[Double] = xs match {
    case Nil => xs
    case y :: ys => y * factor :: scaleList(ys, factor)
  }                                               //> scaleList: (xs: List[Double], factor: Double)List[Double]

  def squareListSec(xs: List[Int]): List[Int] = xs match {
    case Nil => Nil
    case y :: ys => y * y :: squareListSec(ys)
  }                                               //> squareListSec: (xs: List[Int])List[Int]

  def squareListMap(xs: List[Int]): List[Int] =
    xs map (x => x * x)                           //> squareListMap: (xs: List[Int])List[Int]

  def posElems(xs: List[Int]): List[Int] = xs match {
    case Nil => xs
    case y :: ys => if (y > 0) y :: posElems(ys) else posElems(ys)
  }                                               //> posElems: (xs: List[Int])List[Int]

  val nums = List(2, 10, 4, 8, 12)                //> nums  : List[Int] = List(2, 10, 4, 8, 12)
  val numsOther = List(2, 0, -2, 0, -1, 10, 4, 8, 12)
                                                  //> numsOther  : List[Int] = List(2, 0, -2, 0, -1, 10, 4, 8, 12)

  val data = List("a", "a", "a", "b", "c", "c", "a")
                                                  //> data  : List[String] = List(a, a, a, b, c, c, a)

  numsOther filter (x => x > 0)                   //> res0: List[Int] = List(2, 10, 4, 8, 12)
  numsOther filterNot (x => x > 0)                //> res1: List[Int] = List(0, -2, 0, -1)
  numsOther partition (x => x > 0)                //> res2: (List[Int], List[Int]) = (List(2, 10, 4, 8, 12),List(0, -2, 0, -1))
  numsOther takeWhile (x => x > 0)                //> res3: List[Int] = List(2)
  numsOther dropWhile (x => x > 0)                //> res4: List[Int] = List(0, -2, 0, -1, 10, 4, 8, 12)
  numsOther span (x => x > 0)                     //> res5: (List[Int], List[Int]) = (List(2),List(0, -2, 0, -1, 10, 4, 8, 12))

  squareListSec(nums)                             //> res6: List[Int] = List(4, 100, 16, 64, 144)
  squareListMap(nums)                             //> res7: List[Int] = List(4, 100, 16, 64, 144)

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, rest) = xs span (y => y == x)
      first :: pack(rest)
  }                                               //> pack: [T](xs: List[T])List[List[T]]

  def encode[T](xs: List[T]): List[(T, Int)] =
    pack(xs) map (ys => (ys.head, ys.length))     //> encode: [T](xs: List[T])List[(T, Int)]

  def sumManual(xs: List[Int]): Int = xs match {
    case Nil => 0
    case y :: ys => y + sumManual(ys)
  }                                               //> sumManual: (xs: List[Int])Int

  def sumReduce(xs: List[Int]) = (0 :: xs) reduceLeft ((x, y) => x + y)
                                                  //> sumReduce: (xs: List[Int])Int
  def productReduce(xs: List[Int]) = (0 :: xs) reduceLeft ((x, y) => x * y)
                                                  //> productReduce: (xs: List[Int])Int
  def sumFold(xs: List[Int]) = (xs foldLeft 0)(_ + _)
                                                  //> sumFold: (xs: List[Int])Int
  def productFold(xs: List[Int]) = (xs foldLeft 1)(_ * _)
                                                  //> productFold: (xs: List[Int])Int
	
	def concat[T](xs: List[T], ys: List[T]): List[T] =
		(xs foldRight ys)(_ :: _)         //> concat: [T](xs: List[T], ys: List[T])List[T]

	sumFold(nums)                             //> res8: Int = 36
	productFold(nums)                         //> res9: Int = 7680
  pack(data)                                      //> res10: List[List[String]] = List(List(a, a, a), List(b), List(c, c), List(a
                                                  //| ))
  encode(data)                                    //> res11: List[(String, Int)] = List((a,3), (b,1), (c,2), (a,1))

}