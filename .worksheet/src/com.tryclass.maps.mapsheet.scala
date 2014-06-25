package com.tryclass.maps

object mapsheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(101); 
  val romanNumerals = Map('I' -> 1, 'V' -> 5, 'X' -> 10);System.out.println("""romanNumerals  : scala.collection.immutable.Map[Char,Int] = """ + $show(romanNumerals ));$skip(76); 
  val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern");System.out.println("""capitalOfCountry  : scala.collection.immutable.Map[String,String] = """ + $show(capitalOfCountry ));$skip(24); val res$0 = 
	capitalOfCountry("US");System.out.println("""res0: String = """ + $show(res$0));$skip(27); val res$1 = 
	capitalOfCountry get "US";System.out.println("""res1: Option[String] = """ + $show(res$1));$skip(32); val res$2 = 
	capitalOfCountry get "andorra";System.out.println("""res2: Option[String] = """ + $show(res$2));$skip(18); val res$3 = 
	capitalOfCountry;System.out.println("""res3: scala.collection.immutable.Map[String,String] = """ + $show(res$3));$skip(58); 
	val fruit = List("apple", "pear", "orange", "pineapple");System.out.println("""fruit  : List[String] = """ + $show(fruit ));$skip(37); val res$4 = 
	fruit sortWith(_.length < _.length);System.out.println("""res4: List[String] = """ + $show(res$4));$skip(14); val res$5 = 
	fruit.sorted;System.out.println("""res5: List[String] = """ + $show(res$5));$skip(24); val res$6 = 
	fruit groupBy (_.head);System.out.println("""res6: scala.collection.immutable.Map[Char,List[String]] = """ + $show(res$6));$skip(30); val res$7 = 
	fruit groupBy (_.hashCode());System.out.println("""res7: scala.collection.immutable.Map[Int,List[String]] = """ + $show(res$7));$skip(31); val res$8 = 
   Map(0 -> 5, 1 -> -1, 3 ->1);System.out.println("""res8: scala.collection.immutable.Map[Int,Int] = """ + $show(res$8))}
}

//trait Option[+A]

//case class Some[+A](value: A) extends Option[A]

//object None extends Option[Nothing]
