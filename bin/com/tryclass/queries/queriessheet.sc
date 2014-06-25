package com.tryclass.queries

object queriessheet {
  //val books: List[BookEnt] = List(
  val books = List(
    BookEnt(title = "Structure and Interpretation of Computer Programs",
      authors = List("Abelson, Harald", "Sussman, Gerald J.")),
    BookEnt(title = "Introduction to Functional Programming",
      authors = List("Bird, Richard", "Wadler, Phil")),
    BookEnt(title = "Effective Java",
      authors = List("Bloch, Joshua")),
    BookEnt(title = "Effective Java 2",
      authors = List("Bloch, Joshua")),
    BookEnt(title = "Java Puzzlers",
      authors = List("Bloch, Joshua", "Gafter, Neal")),
    BookEnt(title = "Programming in Scala",
      authors = List("Odersky, Martin", "Spoon, Lex", "Venners, Bill")))
                                                  //> books  : List[com.tryclass.queries.BookEnt] = List(BookEnt(Structure and Int
                                                  //| erpretation of Computer Programs,List(Abelson, Harald, Sussman, Gerald J.)),
                                                  //|  BookEnt(Introduction to Functional Programming,List(Bird, Richard, Wadler, 
                                                  //| Phil)), BookEnt(Effective Java,List(Bloch, Joshua)), BookEnt(Effective Java 
                                                  //| 2,List(Bloch, Joshua)), BookEnt(Java Puzzlers,List(Bloch, Joshua, Gafter, Ne
                                                  //| al)), BookEnt(Programming in Scala,List(Odersky, Martin, Spoon, Lex, Venners
                                                  //| , Bill)))
  for (b <- books; a <- b.authors if a startsWith "Bird") yield b.title
                                                  //> res0: List[String] = List(Introduction to Functional Programming)

  for (d <- books if (d.title indexOf "Program") >= 0) yield d.title
                                                  //> res1: List[String] = List(Structure and Interpretation of Computer Programs,
                                                  //|  Introduction to Functional Programming, Programming in Scala)

  (for {
    b1 <- books
    b2 <- books
    if b1.title < b2.title
    a1 <- b1.authors
    a2 <- b2.authors
    if a1 == a2
  } yield a1).distinct                            //> res2: List[String] = List(Bloch, Joshua)

  books flatMap (b =>
    for (a <- b.authors if a startsWith ("Bird")) yield b.title)
                                                  //> res3: List[String] = List(Introduction to Functional Programming)

  books flatMap (b =>
    for (a <- b.authors withFilter (a => a.startsWith("Bird"))) yield b.title)
                                                  //> res4: List[String] = List(Introduction to Functional Programming)
//  books flatMap (b =>
//    b.authors withFilter (a => a startsWith("Bird")) map (y => y.title))
  
}

case class BookEnt(title: String, authors: List[String])