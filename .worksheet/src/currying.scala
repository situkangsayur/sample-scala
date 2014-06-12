object currying {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(152); 
 def sum(f: Int => Int) : (Int, Int) => Int = {
 	def sumF(a: Int, b: Int): Int =
 		if(a<b) 0
 		else f(a) + sumF(a + 1, b)
 	sumF
 };System.out.println("""sum: (f: Int => Int)(Int, Int) => Int""")}
}
