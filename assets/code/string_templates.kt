val name = "Mark"
println("My name is $name") // My name is Mark

val obj = object {
  val name = "Mark"
}
println("Object's name is ${obj.name}") // Object's name is Mark

val list = listOf("Hello", "World")
for ((index, value) in list.withIndex()) {
  println("$index: $value")
}
// 0: Hello
// 1: World
