var a: String = "abc"
a = null // compilation error

val b: String? = null
b = null // ok

val l = b.length // error: variable 'b' can be null

// explicit check
val l = if (b != null) b.length else -1

// safe call operator
b?.length

// safe call + let
val listWithNulls:List<String?> = listOf("A", null)
for (item in listWithNulls) {
  item?.let { println(it) }
}

// elvis operator
val l: Int = if (b != null) b.length else -1
val l = b?.length ?: -1

// elvis w/ return and throw
fun foo(node: Node): String? {
  val parent = node.getParent() ?: return null
  val name = node.getName() ?: throw IllegalArgumentException("name expected")
  // ...
}

// !! operator
val l = b!!.length // throws NullPointerException

// safe casts
val aInt: Int? = a as? Int // returns null if a cannot be cast as Int

// filtering collections
val nullableList: List<Int?> = listOf(1, 2, null, 4)
val intList = List<Int> = nullableList.filterNotNull() // [1, 2, 4]
