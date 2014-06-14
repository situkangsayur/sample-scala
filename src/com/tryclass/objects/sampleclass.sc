package com.tryclass.objects

import com.tryclass.objects.Rational

object sampleclass {
  new Rational(2, 3)                              //> res0: com.tryclass.objects.Rational = 2/3

  def erro(msg: String) = throw new Error(msg)    //> erro: (msg: String)Nothing

  val x = null                                    //> x  : Null = null
  val y: String = x                               //> y  : String = null

  if (true) 1 else false                          //> res1: AnyVal = 1

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
  }                                               //> insert: (x: Int, xs: List[Int])List[Int]
  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => insert(y, isort(ys))
  }                                               //> isort: (xs: List[Int])List[Int]

  def last[T](xs: List[T]): T = xs match {
    case List() => throw new Error("last of empty list")
    case List(x) => x
    case y :: ys => last(ys)
  }                                               //> last: [T](xs: List[T])T

  def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case List() => ys
    case z :: zs => z :: concat(zs, ys)
  }                                               //> concat: [T](xs: List[T], ys: List[T])List[T]

  def reverse[T](xs: List[T]): List[T] = xs match {
    case List() => List()
    case y :: ys => reverse(ys) ++ List(y)
  }                                               //> reverse: [T](xs: List[T])List[T]

  def removeAt[T](n: Int, xs: List[T]) = (xs take n) ::: (xs drop n+1)
                                                  //> removeAt: [T](n: Int, xs: List[T])List[T]

  val sample = List(7, 3, 9, 2)                   //> sample  : List[Int] = List(7, 3, 9, 2)
	val another = (sample take 3) ::: (sample drop 4)
                                                  //> another  : List[Int] = List(7, 3, 9)
	val fromRemoveAt = removeAt(3, sample)    //> fromRemoveAt  : List[Int] = List(7, 3, 9)
  val newList = isort(sample)                     //> newList  : List[Int] = List(2, 3, 7, 9)
  last(newList)                                   //> res2: Int = 9
}