package com.tryclass.objects

import com.tryclass.objects.Rational

object sampleclass {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(109); val res$0 = 
  new Rational(2, 3);System.out.println("""res0: com.tryclass.objects.Rational = """ + $show(res$0));$skip(48); 

  def erro(msg: String) = throw new Error(msg);System.out.println("""erro: (msg: String)Nothing""");$skip(16); 

  val x = null;System.out.println("""x  : Null = """ + $show(x ));$skip(20); 
  val y: String = x;System.out.println("""y  : String = """ + $show(y ));$skip(26); val res$1 = 

  if (true) 1 else false;System.out.println("""res1: AnyVal = """ + $show(res$1));$skip(156); 

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
  };System.out.println("""insert: (x: Int, xs: List[Int])List[Int]""");$skip(122); 
  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => insert(y, isort(ys))
  };System.out.println("""isort: (xs: List[Int])List[Int]""");$skip(156); 

  def last[T](xs: List[T]): T = xs match {
    case List() => throw new Error("last of empty list")
    case List(x) => x
    case y :: ys => last(ys)
  };System.out.println("""last: [T](xs: List[T])T""");$skip(131); 

  def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case List() => ys
    case z :: zs => z :: concat(zs, ys)
  };System.out.println("""concat: [T](xs: List[T], ys: List[T])List[T]""");$skip(126); 

  def reverse[T](xs: List[T]): List[T] = xs match {
    case List() => List()
    case y :: ys => reverse(ys) ++ List(y)
  };System.out.println("""reverse: [T](xs: List[T])List[T]""");$skip(72); 

  def removeAt[T](n: Int, xs: List[T]) = (xs take n) ::: (xs drop n+1);System.out.println("""removeAt: [T](n: Int, xs: List[T])List[T]""");$skip(33); 

  val sample = List(7, 3, 9, 2);System.out.println("""sample  : List[Int] = """ + $show(sample ));$skip(51); 
	val another = (sample take 3) ::: (sample drop 4);System.out.println("""another  : List[Int] = """ + $show(another ));$skip(40); 
	val fromRemoveAt = removeAt(3, sample);System.out.println("""fromRemoveAt  : List[Int] = """ + $show(fromRemoveAt ));$skip(30); 
  val newList = isort(sample);System.out.println("""newList  : List[Int] = """ + $show(newList ));$skip(16); val res$2 = 
  last(newList);System.out.println("""res2: Int = """ + $show(res$2))}
}
