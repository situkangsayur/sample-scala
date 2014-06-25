package com.tryclass.maps

import scala.io.Source

object menmonicsheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(240); 
	val in = Source.fromURL("http://grepcode.com/file/repo1.maven.org/maven2/edu.stanford.nlp/stanford-corenlp/1.3.0/edu/stanford/nlp/models/dcoref/plural.unigrams.txt");System.out.println("""in  : scala.io.BufferedSource = """ + $show(in ));$skip(32); 
	val words = in.getLines.toList;System.out.println("""words  : List[String] = """ + $show(words ));$skip(148); 
	
  val mnemonics = Map('2' -> "ABC", '3' -> "DEF", '4' -> "GHI",
  			'5' -> "JKL", '6' -> "MNO", '7' -> "PQRS", '8' -> "TUV",
  			'9' -> "WXYZ");System.out.println("""mnemonics  : scala.collection.immutable.Map[Char,String] = """ + $show(mnemonics ));$skip(103); 
 	
 	val charCode : Map[Char, Char] =
 		for ((digit,str) <- mnemonics; ltr <- str) yield ltr -> digit;System.out.println("""charCode  : Map[Char,Char] = """ + $show(charCode ));$skip(77); 
 	
 	def wordCode(word: String): String =
 		word.toUpperCase() map charCode;System.out.println("""wordCode: (word: String)String""");$skip(22); val res$0 = 
 	
 	wordCode("Java");System.out.println("""res0: String = """ + $show(res$0));$skip(525); 
 	
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
	val xs = Stream.cons(1, Stream.cons(2, Stream.empty));System.out.println("""xs  : Stream.Cons[Int] = """ + $show(xs ));$skip(17); val res$1 = 
	Stream(1, 2, 3);System.out.println("""res1: scala.collection.immutable.Stream[Int] = """ + $show(res$1));$skip(21); val res$2 = 
	(1 to 100).toStream;System.out.println("""res2: scala.collection.immutable.Stream[Int] = """ + $show(res$2));$skip(130); 
	def streamRange(lo: Int, hi : Int): Stream[Int] ={
		if (lo >= hi) Stream.empty
		else Stream.cons(lo, streamRange(lo+1, hi))
	};System.out.println("""streamRange: (lo: Int, hi: Int)Stream[Int]""");$skip(30); val res$3 = 
	
	streamRange(1, 10).take(3);System.out.println("""res3: scala.collection.immutable.Stream[Int] = """ + $show(res$3))}
	//((100 to 1000).toStream filter isPrime)(1)
}
