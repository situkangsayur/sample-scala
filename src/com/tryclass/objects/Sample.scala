package com.tryclass.objects

import com.tryclass.objects.Rational 

object Sample {
  new Rational(2, 3)
  
  def erro(msg: String)= throw new Error(msg)
  
}