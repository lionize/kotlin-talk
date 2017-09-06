data class Person(val firstName: String, val age: Int)

val person = Person("Mark", 29)
val (name, age) = person
println("$name is $age years old") // Mark is 29 years old

val name = person.component1()
val age = person.component2()

data class HttpResponse(val statusCode: Int, val message: String)
fun function(...): HttpResponse {
  // ...
  return HttpResponse(code, message)
}
val (statusCode, message) = function(...)
val (_, message) = function(...)

val list = listOf(
    listOf("Mark", "Chandler"),
    listOf("David", "Felix")
)
for ((first, last) in list) {
  println("$last, $first")
}
// Chandler, Mark
// Felix, David
