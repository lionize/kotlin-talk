// basic definition
class Person
val person = Person() // no new keyword!

// class with primary constructor
class Person constructor(name: String) {}

// class with omitted constructor keyword
class Person(name: String) {}

// class with init block
class Person(name: String){
  init {
    println("Person initialized with name $name")
  }
}

// class w/ property
class Person(name: String) {
  val identifier = name.toUpperCase()
}
val person = Person("Andrew")
print(person.identifier) // "Andrew"

// class w/ property shorthand
class Person(val name: String)
val person = Person("Naz")
print(person.identifier) // "Naz"

// class w/ lateinit property
class ClassTest {
  private lateinit xmlToJsonParser: XmlToJsonParser

  @Test
  fun whatever() {
    xmlToJsonParser.parse(...)
  }
}

// secondary constructor
class Person {
  constructor(parent: Person) {
    parent.children.add(this)
  }
}

// delegating to primary constructor if present
class Person(val name: String) {
  constructor(name: String, parent: Person) : this(name) {
    parent.children.add(this)
  }
}
