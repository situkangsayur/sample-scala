package com.tryclass.combinatorial

object filtersearch {
      
  val fruit = Set("apple", "banana", "pear")      //> fruit  : scala.collection.immutable.Set[String] = Set(apple, banana, pear)
  val s = (1 to 6).toSet                          //> s  : scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 3, 4)
  
  s map (_ +2)                                    //> res0: scala.collection.immutable.Set[Int] = Set(5, 6, 7, 3, 8, 4)
  fruit filter (_.startsWith("app"))              //> res1: scala.collection.immutable.Set[String] = Set(apple)
}