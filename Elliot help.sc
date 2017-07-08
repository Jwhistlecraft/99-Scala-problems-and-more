//flatten a nested list structure
var b= 1;
flatten(List(List(1, 1), 2, List(3, List(5, 8))))
// this solution isn't mine, I would appreciate going through it with you
def flatten(fList: List[Any]): List[Any] = {
  println(b)
  b =b+1;
  fList flatMap {
    case x: List[_] => print(x); flatten(x)
    case y => println(List(y)); List(y)
  }

}
var a = List(List(1, 1), 2, List(3, List(5, 8)));


val dList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
println(dList.distinct)
//This method drops all duplicates, however the problem asks for the order to remain the same
// The following solution isn't mine and I would like to go through it with you (especially the :: syntax)

compressRecursive(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))

def compressRecursive[A](ls: List[A]): List[A] = ls match {
  case h :: tail => println(h); println(tail); h :: compressRecursive(tail.dropWhile(_ == h))
  case Nil => Nil
}

//Pack consecutive duplicates into sublists
//absolutely no idea, with this one either. Going to wait until I have spoken to you before moving on
pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
def pack[A](ls: List[A]): List[List[A]] = {
  if (ls.isEmpty) List(List())
  else {
    val (packed, next) = ls span { _ == ls.head }
    println(packed);
    println(next);
    if (next == Nil) List(packed)
    else packed :: pack(next)
  }
}