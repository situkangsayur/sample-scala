package com.tryclass.objects

import com.tryclass.objects.Rational

object sampleclass {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(108); val res$0 = 
 new Rational(2, 3);System.out.println("""res0: com.tryclass.objects.Rational = """ + $show(res$0));$skip(49); 
  
  def erro(msg: String)= throw new Error(msg);System.out.println("""erro: (msg: String)Nothing""");$skip(17); 
  
  val x =null;System.out.println("""x  : Null = """ + $show(x ));$skip(21); 
  val y : String = x;System.out.println("""y  : String = """ + $show(y ));$skip(27); val res$1 = 
  
  if(true) 1 else false;System.out.println("""res1: AnyVal = """ + $show(res$1))}
  
}
