package com.tryclass

object sorting {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(298); 

  def merge(xs: List[Int], ys: List[Int]): List[Int] = xs match {
    case Nil => ys
    case x :: xs1 =>
      ys match {
        case Nil => xs
        case y :: ys1 =>
          if (x < y) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }
  };System.out.println("""merge: (xs: List[Int], ys: List[Int])List[Int]""");$skip(457); 

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
  };System.out.println("""margeSort: (xs: List[Int])List[Int]""");$skip(182); 

  def msort(xs: List[Int]): List[Int] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {

      val (fst, snd) = xs splitAt n
      merge(msort(fst), msort(snd))
    }
  };System.out.println("""msort: (xs: List[Int])List[Int]""");$skip(35); 

  val nums = List(2, -4, 5, 7, 1);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(18); val res$0 = 
  margeSort(nums);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(37); 
  val pairs = nums zip "hello world";System.out.println("""pairs  : List[(Int, Char)] = """ + $show(pairs ))}
}
