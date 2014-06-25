package com.tryclass.maps

object polynomialstwo {
  //class Poly(val terms: Map[Int, Double]){
  class Poly(terms0: Map[Int, Double]){
  	def this(bindings: (Int, Double)*) = this(bindings.toMap)
  	val terms = terms0 withDefaultValue 0.0
  	def + (other: Poly) = new Poly((other.terms foldLeft terms)(addTerm))
  	def addTerm(terms: Map[Int, Double], term: (Int, Double)): Map[Int, Double] = {
  		val (exp, coeff) = term
  		terms + (exp -> (coeff + terms(exp)))
  	}
  	def adjust(term: (Int, Double)): (Int, Double) = {
  		val (exp, coeff) = term
			exp -> (coeff + terms(exp))
  	}
  		
  	override def toString =
  		(for ((exp, coeff) <- terms.toList.sorted.reverse) yield coeff +  "x^" + exp) mkString " + "
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(774); 
  
  val p1 = new Poly(1 -> 2.0, 3 -> 4.0, 5 -> 6.2);System.out.println("""p1  : com.tryclass.maps.polynomialstwo.Poly = """ + $show(p1 ));$skip(45); 
  val p2 = new Poly(Map(0 -> 3.0, 3 -> 7.0));System.out.println("""p2  : com.tryclass.maps.polynomialstwo.Poly = """ + $show(p2 ));$skip(10); val res$0 = 
  p1 + p2;System.out.println("""res0: com.tryclass.maps.polynomialstwo.Poly = """ + $show(res$0));$skip(14); val res$1 = 
  p1.terms(7);System.out.println("""res1: Double = """ + $show(res$1))}
}
