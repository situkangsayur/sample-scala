package com.tryclass.pouringwater

object test {
  val problem = new Pouring(Vector(4, 9, 19))     //> problem  : com.tryclass.pouringwater.Pouring = com.tryclass.pouringwater.Pour
                                                  //| ing@458ad742
  problem.moves                                   //> res0: scala.collection.immutable.IndexedSeq[Product with Serializable with c
                                                  //| om.tryclass.pouringwater.test.problem.Move] = Vector(Empty(0), Empty(1), Emp
                                                  //| ty(2), Fill(0), Fill(1), Fill(2), Pour(0,1), Pour(0,2), Pour(1,0), Pour(1,2)
                                                  //| , Pour(2,0), Pour(2,1))
// problem.pathSet
//	problem.pathSet.take(3).toList
	problem.solution(17)                      //> res1: Stream[com.tryclass.pouringwater.test.problem.Path] = Stream(Fill(1) P
                                                  //| our(1,2) Fill(0) Pour(0,2) Fill(0) Pour(0,2)-->Vector(0, 0, 17), ?)
}