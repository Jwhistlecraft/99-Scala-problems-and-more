
/*The parameter weekday is true if it is a weekday, and the parameter vacation
is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation.
Return true if we sleep in.*/

def sleepIn(weekDay:Boolean, vacation:Boolean): Boolean = {
    if (!weekDay  || vacation) true // means(weekDay != true || vacation == true)
    else false
}
sleepIn(weekDay = false, vacation = false)
sleepIn(weekDay = true, vacation = false)
sleepIn(weekDay = false, vacation = true)

/*
Given an int n, return the absolute difference between n and 21,
except return double the absolute difference if n is over 21.*/

def absN(n:Int)= {
  if (n <= 21) 21 - n
  else (n - 21) * 2
}
absN(19)
absN(10)
absN(0)
absN(23)

/*Given an int n, return true if it is within 10 of 100 or 200.
note: Math.abs(num) computes the absolute value of a number.*/

def nearHundred(n:Int):Boolean = {
  if (100 - n <= Math.abs(10) || 200 - n <= Math.abs(10)) true
  else false
}
nearHundred(93)
nearHundred(90)
nearHundred(89)

/*Given a non-empty string and an int n,
return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string
(i.e. n will be in the range 0..str.length()-1 inclusive). */

def missingChar(string:String, int:Int): Unit = {
  val stringFront= string.substring(0,int)
  val stringBack = string.substring(int +1,string.length)
  val stringConc = stringFront + stringBack
println(stringConc)

//until the int does not include the int, where as from the int does
}
missingChar("kitten", 1)
missingChar("kitten", 0)
missingChar("kitten", 4)

/*
Given a string, take the last char and return a new string with
the last char added at the front and back, so "cat" yields "tcatt".
The original string will be length 1 or more.*/

def backAround(string:String): Unit = {
  val findLast = string.substring(string.length-1)
  val stringConc = findLast + string
  println(stringConc)
}
//had to use -1 because strings have a character at the end you cant see which denotes end of string
backAround("cat")
backAround("Hello")
backAround("a")

/*
Given a string, return true if the string starts with "hi" and false otherwise.*/

def startHi(string:String):Boolean ={
  val first2 = string.substring(0,2)
  if (first2.contentEquals("hi")) true
  else false
}
startHi("hi there")
startHi("hi")
startHi("hello hi")

/*We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 3 int values, return true if 1 or more of them are teen.*/

def hasTeen(age1:Int, age2:Int, age3:Int): Boolean = {
  if (age1 < 20 && age1 > 12 ||
      age2 < 20 && age2 > 12 ||
      age3 < 20 && age3 > 12) true
  else false
}
hasTeen(13, 20, 10)
hasTeen(20, 19, 10)
hasTeen(20, 10, 12)

/*Return true if the given string begins with "mix",
except the 'm' can be anything, so "pix", "9ix" .. all count. */

def mixStart(string:String): Boolean ={
  val ixString = string.substring(1,3)
  if (ixString.contentEquals("ix")) true
  else false
}
mixStart("mix snacks")
mixStart("pix snacks")
mixStart("piz snacks")


/*Given 2 int values, return whichever value is nearest to the value 10,
or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.*/

def close10(int1: Int, int2:Int): Unit = {
  (int1,int2) match{
    case x if math.abs(10 - int1) == math.abs(10 - int2) => println(0)
    case y if math.abs(10 - int1) < math.abs(10 - int2) => println("int1=" + int1)
    case z if math.abs(10 - int1) > math.abs(10 - int2) => println("int2=" + int2)
  }
}
close10(8, 13)
close10(13, 8)
close10(13, 7)

/* Return true if the given string contains between 1 and 3 'e' chars.*/

def stringE(string:String): Unit = {
  val countE = string.count(_ == 'e')
  if (countE > 0 && countE < 4) println(countE)
  else println("either too many or too few e's")
}
stringE("Hello")
stringE("Heelle")
stringE("Heelele")

/*
Given a non-empty string and an int N, return the string made starting with char 0,
and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.*/

def everyNth(string:String, stepAmount:Int): Unit ={
  def iter(currentPos: Int) : String = currentPos match{
    case a if currentPos >= string.length => ""//do nothing
    case _ => string(currentPos) + iter(currentPos+stepAmount) //string(i) returns the char at position i
  }
  println(iter(0))
}
everyNth("Miracle", 2)
everyNth("abcdefg", 2)
everyNth("abcdefg", 3)
