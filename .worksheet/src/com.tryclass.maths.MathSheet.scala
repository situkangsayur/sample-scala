package com.tryclass.maths

import com.tryclass.maths.Expr
import com.tryclass.maths.Number
import com.tryclass.maths.Sum

object MathSheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(311); 

  def eval(e: Expr): Int = {
    if (e.isNumber) e.numValue
    else if (e.isSum) eval(e.leftOp) + eval(e.rightOp)
    else throw new Error("unknown expression "+e)
  };System.out.println("""eval: (e: com.tryclass.maths.Expr)Int""")}

}
