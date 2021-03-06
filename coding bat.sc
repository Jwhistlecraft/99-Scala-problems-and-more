
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

/* Given a non-empty string and an int N, return the string made starting with char 0,
and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.*/

def everyNth(stringy:String, stepAmount:Int): Unit ={
  def iter(currentPos: Int) : String = currentPos match{
    case a if currentPos >= stringy.length => ""//do nothing
    case _ => stringy(currentPos) + iter(currentPos+stepAmount) //string(i) returns the char from string at position i
  }
  println(iter(0))
}

everyNth("Miracle", 2)
everyNth("abcdefg", 2)
everyNth("abcdefg", 3)

/* We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.*/

def monkeyTrouble(aSmile:Boolean, bSmile:Boolean): Boolean ={
  if ((aSmile && bSmile) || (!aSmile && !bSmile)) true
  else false
}

monkeyTrouble(true, true)
monkeyTrouble(false, false)
monkeyTrouble(true, false) /*note for future if i have more parameters that can be cleanly assessed using if/else
                            use a pattern match.*/

/*
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.*/

def parrotTrouble(naughty:Boolean, time: Int): Boolean = {
  (naughty, time) match {
    case x if (naughty == true && time < 7)  => true
    case y if (naughty == true && time > 20) => true
    case _ => false
  }
}

parrotTrouble(true, 6)
parrotTrouble(true, 7)
parrotTrouble(false, 6)
parrotTrouble(true, 22)

/*
Given 2 int values, return true if one is negative and one is positive.
Except if the parameter "negative" is true, then return true only if both are negative.*/

def posNeg(intA:Int, intB: Int, negative: Boolean): Boolean ={
  (intA, intB, negative) match {
    case a if ((intA < 0) && (intB > 0) && (!negative)) => true
    case b if ((intA > 0) && (intB < 0) && (!negative)) => true
    case c if ((intA < 0) && (intB < 0) && (negative)) => true
    case _ => false
  }
}

posNeg(1, -1, false)
posNeg(-1, 1, false)
posNeg(-4, -5, true)


/* Given a string, return a new string where the first and last chars have been exchanged.*/

def frontBack(string:String): Unit = {
  val front = string(0)
  val back = string(string.length-1)
  val middle = if (string.length > 3) string.substring(1,string.length-1) else "" // else "" is returning an empty string

  if (string.length > 3) println(back + middle + front)
  else println(back + front)

}
frontBack("code")
frontBack("a")
frontBack("ab")


/*
Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
 se the % "mod" operator -- see Introduction to Mod*/

def or35(int:Int): Boolean={
if (int %3 ==0 || int %5 == 5) true
else false
}

or35(3)
or35(10)
or35(8)


/*We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 given 2 int values, return true if one or the other is teen, but not both.*/

def loneTeen(intA:Int, intB:Int): Boolean ={
  (intA,intB) match {
    case x if intA >= 12 && intA <= 19 => true
    case y if intB >= 12 && intB <= 19 => true
    case _ => false
  }
}

loneTeen(13, 99)
loneTeen(21, 19)
loneTeen(13, 13)


/*Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only if it is 'z',
so "ozymandias" yields "oz".*/

def startOz(str: String): Unit ={
    var result = ""
    if (str.length >= 1 && str.charAt(0) == 'o') println(result + str.charAt(0))
    if (str.length >= 2 && str.charAt(1) == 'z') println(result + str.charAt(1))
}

startOz("ozymandias")
startOz("bzoo")
startOz("oxx")

/*Given 2 int values, return true if they are both in the range 30..40 inclusive,
or they are both in the range 40..50 inclusive.*/