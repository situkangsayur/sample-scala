package com.tryclass.fortrans

object fortrans {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
  val n = 5;System.out.println("""n  : Int = """ + $show(n ));$skip(12); 
  val i = 5;System.out.println("""i  : Int = """ + $show(i ))}
/*  for{
  	i <- 1 until n
  	j <- 1 until 1;
  	if isPrime(i + j)
  } yield (i, j)
  
  (1 until n) flatMap (i => (1 until i).withFilter (j => isPrime(i+j))
  .map(j => (i,j)))
  */
}
