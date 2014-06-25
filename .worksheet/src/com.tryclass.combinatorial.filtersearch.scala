package com.tryclass.combinatorial

object filtersearch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(109); 
      
  val fruit = Set("apple", "banana", "pear");System.out.println("""fruit  : scala.collection.immutable.Set[String] = """ + $show(fruit ));$skip(25); 
  val s = (1 to 6).toSet;System.out.println("""s  : scala.collection.immutable.Set[Int] = """ + $show(s ));$skip(18); val res$0 = 
  
  s map (_ +2);System.out.println("""res0: scala.collection.immutable.Set[Int] = """ + $show(res$0));$skip(37); val res$1 = 
  fruit filter (_.startsWith("app"));System.out.println("""res1: scala.collection.immutable.Set[String] = """ + $show(res$1))}
}
