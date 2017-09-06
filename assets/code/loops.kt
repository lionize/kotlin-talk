for (item in collection) print(item)

for (i in array.indices) {
  print(array[i])
}

for ((index, value) in array.withIndex()) {
  println("the element at $index is $value")
}

while (x > 0) {
  x--
}

do {
  val y = retrieveData()
} while (y != null) // y is visible here
