package com.tryclass.maths

//import com.tryclass.maths.Expr;

class Sum(e1: Expr, e2: Expr) extends Expr{
  def isNumber: Boolean = false
  def isSum: Boolean = true
  def numValue: Int = throw new Error("Sum.numValue")
  def leftOp: Expr = e1
  def rightOp: Expr = e2
} 