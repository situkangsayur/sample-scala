package com.tryclass.lists
import com.tryclass.lists

object nth {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(218); 
  def nth[T](n: Int, xs: List[T]): T =
  	if (xs.isEmpty) throw new IndexOutOfBoundsException
    else if (n == 0) xs.head
    else nth(n - 1, xs.tail);System.out.println("""nth: [T](n: Int, xs: com.tryclass.lists.List[T])T""");$skip(63); 
 	
 	val list = new Cons(1, new Cons(2, new Cons(3, new Nil)));System.out.println("""list  : com.tryclass.lists.Cons[Int] = """ + $show(list ));$skip(18); val res$0 = 
 	
 	nth(2, list);System.out.println("""res0: Int = """ + $show(res$0));$skip(14); val res$1 = 
	nth(-1,list);System.out.println("""res1: Int = """ + $show(res$1))}
}
