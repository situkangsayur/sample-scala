package com.tryclass.patternm

object ExprPMSheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(179); 

  def show(e: ExprPM): String = e match {
    case Number(x) => x.toString
    case Sum(l, r) => show(l) + " + " + show(r)
  };System.out.println("""show: (e: com.tryclass.patternm.ExprPM)String""")}
}
