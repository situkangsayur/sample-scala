package com.tryclass.pouringwater

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(94); 
  val problem = new Pouring(Vector(4, 9, 19));System.out.println("""problem  : com.tryclass.pouringwater.Pouring = """ + $show(problem ));$skip(16); val res$0 = 
  problem.moves;System.out.println("""res0: scala.collection.immutable.IndexedSeq[Product with Serializable with com.tryclass.pouringwater.test.problem.Move] = """ + $show(res$0));$skip(75); val res$1 = 
// problem.pathSet
//	problem.pathSet.take(3).toList
	problem.solution(17);System.out.println("""res1: Stream[com.tryclass.pouringwater.test.problem.Path] = """ + $show(res$1))}
}
