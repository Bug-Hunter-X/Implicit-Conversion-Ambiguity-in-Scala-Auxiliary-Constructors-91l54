```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
}

//Add an explicit type annotation
class MyClass2(val x: Int) {
  def this(s:String) = this(s.toInt)
}

//Avoiding Ambiguity by restricting implicit conversions
//or using explicit type annotations
```