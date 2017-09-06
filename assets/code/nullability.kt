var a: String = "abc"
a = null // compilation error

val b: String? = "Hello"
b = null // ok

val l = b.length // error because b might be null

val l = if (b != null) b.length else -1

val zip = person?.city?.zip

val listWithNulls: List<String?> = listOf("A", null)
for (item in listWithNulls) {
  item?.let {
    println(it)
    println(it.length)
  }
}

val l: Int = if (b != null) b.length else -1
val l = b?.length ?: -1

fun foo(node: Node): String? {
  val parent = node.parent ?: return null
  val name = node.name ?: throw IllegalArgumentException("name expected")
  // ...
}

val l = b!!.length // throws NullPointerException

val aInt: Int? = a as? Int // returns null if a cannot be cast as Int

val nullableList: List<Int?> = listOf(1, 2, null, 4)
val intList = List<Int> = nullableList.filterNotNull() // [1, 2, 4]
