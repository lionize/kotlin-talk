class Person
val person = Person() // no new keyword!

class Person constructor(name: String) {}

class Person(name: String) {}

class Person(name: String) {
  init {
    println("Person initialized with name $name")
  }
}

// java equivalent
public class Person {
  public Person(String name) {
    System.out.println("Person initialized with " + name);
  }
}

class Person(name: String) {
  val identifier = name.toUpperCase()
}
val person = Person("Andrew")
print(person.identifier) // "ANDREW"

class Person(val name: String)
val person = Person("Naz")
print(person.name) // "Naz"

// java equivalent
class Person {
  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
Person person = new Person("Naz");
System.out.println(person.name);

class Presentation(
    val name: String = "Adventurer's Guide to Kotlin",
    private val presenter: String = "Jason Roell"
)
val presentation = Presentation(presenter = "Mark Chandler")
println(presentation.name) // Adventurer's Guide to Kotlin

var stringRepresentation // can omit property type if it can be inferred from getter
  get() = this.toString()
  set(value) {
    setDataFromString(value)
  }

var setterVisibility: String = "abc"
  private set

var counter = 0 // initializer value is written directly to backing field
  set(value) {
    if (value >= 0) field = value // field references the backing field value
  }

private var _table: Map<String, Int>? = null
public val table: Map<String, Int>
  get() {
    if (_table == null) {
      _table = HashMap()
    }
    return _table
  }

class Person {
  lateinit var name: String

  fun changeName(name: String) {
    this.name = name
  }
}
val person = Person()
person.changeName("Taylor")
println(person.name) // Taylor

@RunWith(MockitoJUnitRunner:class)
class ClassTest {
  private lateinit var xmlToJsonParser: XmlToJsonParser

  @Test
  fun whatever() {
    xmlToJsonParser.parse(...)
  }
}

class Person(val name: String) {
  constructor(name: String, parentList: MutableList<Person>) : this(name) {
    parentList.add(this)
  }
}
val list = mutableListOf<Person>()
val person1 = Person("Mark")
val person2 = Person("David", list)
list[0] == person2// true
println(person2.name) // David

class Person(val name: String) {
  fun capitalizeName(): String {
    return name.capitalize()
  }
}
val person = Person("mark")
person.capitalizeName() // returns Mark
