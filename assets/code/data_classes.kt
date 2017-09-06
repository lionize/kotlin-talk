data class Person(val firstName: String, val lastName: String)

val person1 = Person("Tom", "Ringenbach")
val person2 = Person("Ronn", "Ross")
val person3 = Person("Ronn", "Ross")

class NonDataPerson(val firstName: String, val lastName: String)
val person = NonDataPerson("Mark", "Chandler")
println(person) // NonDataPerson@511d50c0

println(person1) // Person(firstName=Tom, lastName=Ringenbach)

println("${person1.firstName} ${person1.lastName}") // Tom Ringenbach
println("${person1.component1()} ${person1.component2()}}") // Tom Ringenbach

val (firstName, lastName) = person1
println("$lastName, $firstName") // Ringenbach, Tom

person1.equals(person2) // false
person1 == person2 // false
person2.equals(person3) // true
person2 == person3 // true

val person4 = person1.copy(lastName = "Cruise")
println(person4) // Person(firstName=Tom, lastName=Cruise)
