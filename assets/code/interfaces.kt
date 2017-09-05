// defining an interface
interface ThingBuilder {
  val name: String
  fun build()
}

// implementing the interface
class Thing(override val name: String) : ThingBuilder {
  override fun build() {
    println("Hello, $name")
  }
}
