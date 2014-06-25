package com.tryclass.queries

object queriessheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(731); 
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
      authors = List("Odersky, Martin", "Spoon, Lex", "Venners, Bill")));System.out.println("""books  : List[com.tryclass.queries.BookEnt] = """ + $show(books ));$skip(72); val res$0 = 
  for (b <- books; a <- b.authors if a startsWith "Bird") yield b.title;System.out.println("""res0: List[String] = """ + $show(res$0));$skip(70); val res$1 = 

  for (d <- books if (d.title indexOf "Program") >= 0) yield d.title;System.out.println("""res1: List[String] = """ + $show(res$1));$skip(150); val res$2 = 

  (for {
    b1 <- books
    b2 <- books
    if b1.title < b2.title
    a1 <- b1.authors
    a2 <- b2.authors
    if a1 == a2
  } yield a1).distinct;System.out.println("""res2: List[String] = """ + $show(res$2));$skip(88); val res$3 = 

  books flatMap (b =>
    for (a <- b.authors if a startsWith ("Bird")) yield b.title);System.out.println("""res3: List[String] = """ + $show(res$3));$skip(102); val res$4 = 

  books flatMap (b =>
    for (a <- b.authors withFilter (a => a.startsWith("Bird"))) yield b.title);System.out.println("""res4: List[String] = """ + $show(res$4))}
//  books flatMap (b =>
//    b.authors withFilter (a => a startsWith("Bird")) map (y => y.title))
  
}

case class BookEnt(title: String, authors: List[String])
