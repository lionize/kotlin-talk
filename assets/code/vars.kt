var hello = "Hello"
hello = "World"

val hello = "Hello"
hello = "World"
// error: val cannot be reassigned

val list = mutableListOf("Hello", "World")

list.add("Foo")
list.add("Bar")

println(list)
// [Hello, World, Foo, Bar]

data class Test

val test = Test()

val list: List<String>
list = listOf("Hello")
