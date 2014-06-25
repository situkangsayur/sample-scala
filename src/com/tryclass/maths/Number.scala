package com.tryclass.maths

//import com.tryclass.maths.Expr;

class Number(n: Int) extends Expr{
	  def isNumber: Boolean = true
	  def isSum: Boolean = false
	  def numValue: Int = n
	  def leftOp: Expr = throw new Error("Number.leftOp")
	  def rightOp: Expr = throw new Error("Number.rightOp")
	}