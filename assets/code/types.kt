// is operator
if (obj is String) {
  print(obj.length)
}

// smart cast
fun demo(x: Any) {
  if (x is String) {
    print(x.length) // x is automatically cast to String
  }
}

if (x !is String) return
print(x.length) // x is automatically cast to String

// unsafe cast
val x: String = y as String

val y: String? = null
val x: String? = y as String?

// safe nullable cast
val x: String? = y as? String // null if cast not possible

// array/list instantiation keywords
val arr = arrayOf("A", "B", "C")
val list = listOf("A", "B", "C")
val mutList = mutableListOf("A", "B", "C")
mutList.add("D")
