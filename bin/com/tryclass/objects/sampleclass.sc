package com.tryclass.objects

import com.tryclass.objects.Rational

object sampleclass {
 new Rational(2, 3)                               //> res0: com.tryclass.objects.Rational = 2/3
  
  def erro(msg: String)= throw new Error(msg)     //> erro: (msg: String)Nothing
  
  val x =null                                     //> x  : Null = null
  val y : String = x                              //> y  : String = null
  
  if(true) 1 else false                           //> res1: AnyVal = 1
  
}