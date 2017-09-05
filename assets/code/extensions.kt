// prefix fun name with receiver type
fun MutableList<Int>.swap(index1: Int, index2: Int) {
  val tmp = this[index1]
  this[index1] = this[index2]
  this[index2] = tmp
}

val l = mutableListOf(1, 2, 3)
l.swap(0, 2) // 'this' inside swap holds value of 'l'

// add scream function to all String types
fun String.scream() {
  println(this.toUpperCase())
}

"hello".scream() // "HELLO"
