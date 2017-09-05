// define a data class
data class Person(val firstName: String, val lastName: String)

val person1 = Person("Tom", "Ringenbach")
val person2 = Person("Ronn", "Ross")
val person3 = Person("Ronn", "Ross")

println("$person1") // Person(firstName=Tom, lastName=Ringenbach)

println("${person1.firstName} ${person1.lastName}") // Tom Ringenbach

println(person1.equals(person2)) // false
println(person2.equals(person3)) // true

val (firstName, lastName) = person1
println("$lastName, $firstName") // Ringenbach, Tom

val person4 = person1.copy(lastName = "Cruise")
println(person4.lastName) // Cruise
