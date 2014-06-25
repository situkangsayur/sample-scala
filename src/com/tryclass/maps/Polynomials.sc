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
  }
  
  val p1 = new Poly(1 -> 2.0, 3 -> 4.0, 5 -> 6.2) //> p1  : com.tryclass.maps.Polynomials.Poly = 6.2x^5 + 4.0x^3 + 2.0x^1
  val p2 = new Poly(Map(0 -> 3.0, 3 -> 7.0))      //> p2  : com.tryclass.maps.Polynomials.Poly = 7.0x^3 + 3.0x^0
  p1 + p2                                         //> res0: com.tryclass.maps.Polynomials.Poly = 6.2x^5 + 11.0x^3 + 2.0x^1 + 3.0x^
                                                  //| 0
  p1.terms(7)                                     //> res1: Double = 0.0
}