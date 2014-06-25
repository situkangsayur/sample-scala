package com.tryclass.patternm

trait ExprPM
case class Number (n: Int) extends ExprPM
case class Sum (e1: ExprPM, e2: ExprPM) extends ExprPM
