package com.tryclass

object sorting {

  def merge(xs: List[Int], ys: List[Int]): List[Int] = xs match {
    case Nil => ys
    case x :: xs1 =>
      ys match {
        case Nil => xs
        case y :: ys1 =>
          if (x < y) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }
  }                                               //> merge: (xs: List[Int], ys: List[Int])List[Int]

  def margeSort(xs: List[Int]): List[Int] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {

      def mergeIn(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if (x < y) x :: mergeIn(xs1, ys)
          else y :: mergeIn(xs, ys1)
      }
      val (fst, snd) = xs splitAt n
      mergeIn(margeSort(fst), margeSort(snd))
    }
  }                                               //> margeSort: (xs: List[Int])List[Int]

  def msort(xs: List[Int]): List[Int] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {

      val (fst, snd) = xs splitAt n
      merge(msort(fst), msort(snd))
    }
  }                                               //> msort: (xs: List[Int])List[Int]

  val nums = List(2, -4, 5, 7, 1)                 //> nums  : List[Int] = List(2, -4, 5, 7, 1)
  margeSort(nums)                                 //> res0: List[Int] = List(-4, 1, 2, 5, 7)
  val pairs = nums zip "hello world"              //> pairs  : List[(Int, Char)] = List((2,h), (-4,e), (5,l), (7,l), (1,o))
}