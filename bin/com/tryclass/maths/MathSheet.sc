package com.tryclass.maths


object MathSheet {

  def eval(e: Expr): Int = {
    if (e.isNumber) e.numValue
    else if (e.isSum) eval(e.leftOp) + eval(e.rightOp)
    else throw new Error("unknown expression "+e)
  }                                               //> eval: (e: com.tryclass.maths.Expr)Int
}