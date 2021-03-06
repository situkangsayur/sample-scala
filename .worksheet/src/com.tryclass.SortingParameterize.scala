package com.tryclass

object SortingParameterize {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(514); 
  def msort[T](xs: List[T])(lt: (T, T) => Boolean): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {

      def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if (lt(x, y )) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }
      val (fst, snd) = xs splitAt n
      merge(msort(fst)(lt), msort(snd)(lt))
    }
  };System.out.println("""msort: [T](xs: List[T])(lt: (T, T) => Boolean)List[T]""");$skip(35); 

  val nums = List(2, -4, 5, 7, 1);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(62); 
  val fruits = List("apple", "pineapple", "orange", "banana");System.out.println("""fruits  : List[String] = """ + $show(fruits ));$skip(41); val res$0 = 
  msort(nums)((x: Int, y: Int) => x < y);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(63); val res$1 = 
  msort(fruits)((x: String, y : String) => x.compareTo(y) < 0);System.out.println("""res1: List[String] = """ + $show(res$1))}
}
