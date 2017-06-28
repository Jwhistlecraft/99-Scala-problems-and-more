//find the last element of a list
val listA = List(1,1,2,3,5,8)
println(listA.last)

//find the penultimate
val listB = List(1,1,2,3,5,8)
if (listB.length < 2) println("Jog on")
else println(listB(listB.length-2))

//find the nth element of a list
val listC = List(1,1,2,3,5,8)
var nth = 3
println(listC(nth))

//find the numbers of elements in a list
val listD = List(1,1,2,3,5,8)
var dLength= listD.length
println(dLength)

//reverse a list
val listE = List(1,1,2,3,5,8)
println(listE.reverse)

//find out if a list is a palindrome
val listF = List(1,2,3,2,1)
val listR = listF.reverse
if (listF == listR) println("yes it is a palindrome")
else println("no it aint no palindrome")

//flatten a nested list structure

