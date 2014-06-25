package com.tryclass.fortrans

object fortrans {
  val n = 5                                       //> n  : Int = 5
  val i = 5                                       //> i  : Int = 5
/*  for{
  	i <- 1 until n
  	j <- 1 until 1;
  	if isPrime(i + j)
  } yield (i, j)
  
  (1 until n) flatMap (i => (1 until i).withFilter (j => isPrime(i+j))
  .map(j => (i,j)))
  */
}