// for can loop through anything providing iterator
for (item in collection) print(item)

// for using index
for (i in array.indices) {
  print(array[i])
}

// for with index and value
for ((index, value) in array.withIndex()) {
  println("the element at $index is $value")
}

// while
while (x > 0) {
  x--
}

// do-while
do {
  val y = retrieveData()
} while (y != null) // y is visible here
