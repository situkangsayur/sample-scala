package com.tryclass.maths

import com.tryclass.maths.Sum
import com.tryclass.maths.Number

trait Expr {
//  def eval: Int = this match{
//    case Number(n) => n
//    case Sum(e1, e2) => e1.eval + e2.eval
//  }
  def isNumber: Boolean
  def isSum: Boolean
  def numValue: Int
  def leftOp: Expr
  def rightOp: Expr
}