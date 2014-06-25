package com.tryclass.maps

object mapsheet {
  val romanNumerals = Map('I' -> 1, 'V' -> 5, 'X' -> 10)
                                                  //> romanNumerals  : scala.collection.immutable.Map[Char,Int] = Map(I -> 1, V ->
                                                  //|  5, X -> 10)
  val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern")
                                                  //> capitalOfCountry  : scala.collection.immutable.Map[String,String] = Map(US -
                                                  //| > Washington, Switzerland -> Bern)
	capitalOfCountry("US")                    //> res0: String = Washington
	capitalOfCountry get "US"                 //> res1: Option[String] = Some(Washington)
	capitalOfCountry get "andorra"            //> res2: Option[String] = None
	capitalOfCountry                          //> res3: scala.collection.immutable.Map[String,String] = Map(US -> Washington, 
                                                  //| Switzerland -> Bern)
	val fruit = List("apple", "pear", "orange", "pineapple")
                                                  //> fruit  : List[String] = List(apple, pear, orange, pineapple)
	fruit sortWith(_.length < _.length)       //> res4: List[String] = List(pear, apple, orange, pineapple)
	fruit.sorted                              //> res5: List[String] = List(apple, orange, pear, pineapple)
	fruit groupBy (_.head)                    //> res6: scala.collection.immutable.Map[Char,List[String]] = Map(p -> List(pear
                                                  //| , pineapple), a -> List(apple), o -> List(orange))
	fruit groupBy (_.hashCode())              //> res7: scala.collection.immutable.Map[Int,List[String]] = Map(-434214934 -> L
                                                  //| ist(pineapple), 3436774 -> List(pear), -1008851410 -> List(orange), 93029210
                                                  //|  -> List(apple))
   Map(0 -> 5, 1 -> -1, 3 ->1)                    //> res8: scala.collection.immutable.Map[Int,Int] = Map(0 -> 5, 1 -> -1, 3 -> 1)
                                                  //| 
}

//trait Option[+A]

//case class Some[+A](value: A) extends Option[A]

//object None extends Option[Nothing]