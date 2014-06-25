package com.tryclass.patternm

object ExprPMSheet {

  def show(e: ExprPM): String = e match {
    case Number(x) => x.toString
    case Sum(l, r) => show(l) + " + " + show(r)
  }                                               //> show: (e: com.tryclass.patternm.ExprPM)String
}