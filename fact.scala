class factor{
	def fact(no:Int):Int = if ( no == 1 ) 1 else no*fact(no-1) 
}


object factor{
	def main(args: Array[String]) = {
		val number = readInt()
		val factorial = new factor()
		val fac = factorial.fact(number)
		println(fac)
	}
}
