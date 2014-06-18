package com.tryclass.lists
import com.tryclass.lists

object nth {
  def nth[T](n: Int, xs: List[T]): T =
  	if (xs.isEmpty) throw new IndexOutOfBoundsException
    else if (n == 0) xs.head
    else nth(n - 1, xs.tail)                      //> nth: [T](n: Int, xs: com.tryclass.lists.List[T])T
 	
 	val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
                                                  //> list  : com.tryclass.lists.Cons[Int] = com.tryclass.lists.Cons@5f2050f6
 	
 	nth(2, list)                              //> res0: Int = 3
	nth(-1,list)                              //> java.lang.IndexOutOfBoundsException
                                                  //| 	at com.tryclass.lists.nth$$anonfun$main$1.nth$1(com.tryclass.lists.nth.s
                                                  //| cala:6)
                                                  //| 	at com.tryclass.lists.nth$$anonfun$main$1.apply$mcV$sp(com.tryclass.list
                                                  //| s.nth.scala:13)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at com.tryclass.lists.nth$.main(com.tryclass.lists.nth.scala:4)
                                                  //| 	at com.tryclass.lists.nth.main(com.tryclass.lists.nth.scala)
}