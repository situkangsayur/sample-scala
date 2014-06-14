package com.tryclass

object SortingParameterize {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(485); 
 
  

  def msort[T](xs: List[T]): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {

      def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if (x < y) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }
      val (fst, snd) = xs splitAt n
      merge(msort(fst), msort(snd))
    }
  };System.out.println("""msort: [T](xs: List[T])List[T]""");$skip(35); 

  val nums = List(2, -4, 5, 7, 1);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(14); val res$0 = 
  msort(nums);System.out.println("""res0: List[Int] = """ + $show(res$0))}
}
