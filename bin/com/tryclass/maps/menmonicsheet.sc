package com.tryclass.maps

import scala.io.Source

object menmonicsheet {
	val in = Source.fromURL("http://grepcode.com/file/repo1.maven.org/maven2/edu.stanford.nlp/stanford-corenlp/1.3.0/edu/stanford/nlp/models/dcoref/plural.unigrams.txt")
                                                  //> in  : scala.io.BufferedSource = non-empty iterator
	val words = in.getLines.toList            //> words  : List[String] = List(<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Tr
                                                  //| ansitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">, 
                                                  //| <html id="html">, "    <head>", "        <title>GC: edu / stanford / nlp / m
                                                  //| odels / dcoref / plural.unigrams.txt - GrepCode Source</title>", "        <m
                                                  //| eta name="verify-v1" content="oDbHfknRLVnvs+1b/O61iSxPEhVr3O08Fd3QqJ1cGh8="/
                                                  //| >", "        <meta name="verify-v1" content="d2G+nnw2Xr6jBfde7yNvdZirW9Y6K0f
                                                  //| a+56zhEmm6YA="/>", "        <meta name="msvalidate.01" content="62B5A32F828B
                                                  //| C27E3852FB825A5156E4" />", "        <meta name="description" content="edu / 
                                                  //| stanford / nlp / models / dcoref / plural.unigrams.txt"/>", "        <meta p
                                                  //| roperty="fb:app_id" content="143989634057"/>", "        <link rel="canonical
                                                  //| " href="http://grepcode.com/file/repo1.maven.org/maven2/edu.stanford.nlp/sta
                                                  //| nford-corenlp/1.3.0/edu/stanford/nlp/models/dcoref/plural.unigrams.txt"/>", 
                                                  //| "        <link rel="sear
                                                  //| Output exceeds cutoff limit.
	
  val mnemonics = Map('2' -> "ABC", '3' -> "DEF", '4' -> "GHI",
  			'5' -> "JKL", '6' -> "MNO", '7' -> "PQRS", '8' -> "TUV",
  			'9' -> "WXYZ")            //> mnemonics  : scala.collection.immutable.Map[Char,String] = Map(8 -> TUV, 4 -
                                                  //| > GHI, 9 -> WXYZ, 5 -> JKL, 6 -> MNO, 2 -> ABC, 7 -> PQRS, 3 -> DEF)
 	
 	val charCode : Map[Char, Char] =
 		for ((digit,str) <- mnemonics; ltr <- str) yield ltr -> digit
                                                  //> charCode  : Map[Char,Char] = Map(E -> 3, X -> 9, N -> 6, T -> 8, Y -> 9, J -
                                                  //| > 5, U -> 8, F -> 3, A -> 2, M -> 6, I -> 4, G -> 4, V -> 8, Q -> 7, L -> 5,
                                                  //|  B -> 2, P -> 7, C -> 2, H -> 4, W -> 9, K -> 5, R -> 7, O -> 6, D -> 3, Z -
                                                  //| > 9, S -> 7)
 	
 	def wordCode(word: String): String =
 		word.toUpperCase() map charCode   //> wordCode: (word: String)String
 	
 	wordCode("Java")                          //> res0: String = 5282
 	
// 	val wordsForNum: Map[String, Seq[String]] =
// 		words groupBy wordCode
 /*
	def encode encode(number:String): Set[List[String]] =
		if (number.isEmpty) Set(List())
		else{
			for {
				split <- 1 to number.length
				word <- wordsForNum(number take split)
				rest <- encode(number drop split)
			} yield word :: rest
		}.toSet
		*/
//encode("7225247386")

	//def translate(number: String): Set[String] =
	//	encode(number) map (_ mkStirng " ")
	
	//translate()
	val xs = Stream.cons(1, Stream.cons(2, Stream.empty))
                                                  //> xs  : Stream.Cons[Int] = Stream(1, ?)
	Stream(1, 2, 3)                           //> res1: scala.collection.immutable.Stream[Int] = Stream(1, ?)
	(1 to 100).toStream                       //> res2: scala.collection.immutable.Stream[Int] = Stream(1, ?)
	def streamRange(lo: Int, hi : Int): Stream[Int] ={
		if (lo >= hi) Stream.empty
		else Stream.cons(lo, streamRange(lo+1, hi))
	}                                         //> streamRange: (lo: Int, hi: Int)Stream[Int]
	
	streamRange(1, 10).take(3)                //> res3: scala.collection.immutable.Stream[Int] = Stream(1, ?)
	//((100 to 1000).toStream filter isPrime)(1)
}