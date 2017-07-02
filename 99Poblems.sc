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
flatten(List(List(1, 1), 2, List(3, List(5, 8))))
// this solution isn't mine, I would appreciate going through it with you
def flatten(fList: List[Any]): List[Any] = fList flatMap {
  case x: List[_] => flatten(x)
  case y => List(y)
}

// difference between flatmap and map (Alvin Alexander)
val fruits = Seq("apple", "banana", "orange")
//fruits: Seq[String] = List(apple, banana, orange)
fruits.map(_.toUpperCase)
//res0: Seq[java.lang.String] = List(APPLE, BANANA, ORANGE)
fruits.flatMap(_.toUpperCase)
//res1: Seq[Char] = List(A, P, P, L, E, B, A, N, A, N, A, O, R, A, N, G, E)
//flat map considers a Sting as a sequence of Char,
//and can be considered as a combination of map and then flatten
//can be remembered as mapFlat to remember the sequence in which it works


//eliminate duplicates from within a list
val dList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
println(dList.distinct)
//This method drops all duplicates, however the problem asks for the order to remain the same
// The following solution isn't mine and I would like to go through it with you (especially the :: syntax)

def compressRecursive[A](ls: List[A]): List[A] = ls match {
  case Nil => Nil
  case h :: tail => h :: compressRecursive(tail.dropWhile(_ == h))
}

//Pack consecutive duplicates into sublists


