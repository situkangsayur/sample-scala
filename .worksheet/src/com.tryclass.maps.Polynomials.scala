package com.tryclass.maps

object Polynomials {
  
  //class Poly(val terms: Map[Int, Double]){
  class Poly(terms0: Map[Int, Double]){
  	def this(bindings: (Int, Double)*) = this(bindings.toMap)
  	val terms = terms0 withDefaultValue 0.0
  	def + (other: Poly) = new Poly(terms ++ (other.terms map adjust))
  	def adjust(term: (Int, Double)): (Int, Double) = {
  		val (exp, coeff) = term
//  		terms get exp match {
//  			case Some(coeff1) => exp -> (coeff + coeff1)
//  			case None => exp -> coeff
//  		}
			exp -> (coeff + terms(exp))
  	}
  		
  	override def toString =
  		(for ((exp, coeff) <- terms.toList.sorted.reverse) yield coeff +  "x^" + exp) mkString " + "
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(733); 
  
  val p1 = new Poly(1 -> 2.0, 3 -> 4.0, 5 -> 6.2);System.out.println("""p1  : com.tryclass.maps.Polynomials.Poly = """ + $show(p1 ));$skip(45); 
  val p2 = new Poly(Map(0 -> 3.0, 3 -> 7.0));System.out.println("""p2  : com.tryclass.maps.Polynomials.Poly = """ + $show(p2 ));$skip(10); val res$0 = 
  p1 + p2;System.out.println("""res0: com.tryclass.maps.Polynomials.Poly = """ + $show(res$0));$skip(14); val res$1 = 
  p1.terms(7);System.out.println("""res1: Double = """ + $show(res$1))}
}
