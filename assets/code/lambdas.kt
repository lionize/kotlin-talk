fun printFormattedList(list: List<String>, format: (String) -> String) {
  for (s in list) {
    println(format(s))
  }
}

fun capitalizeString(str: String) = str.toUpperCase()

printFormattedList(listOf("hello", "world"), ::capitalizeString) // "HELLO" "WORLD"

val formatter = { str: String -> str.toUpperCase() }

printFormattedList(listOf("hello", "world"), formatter)

val formatter: (String) -> String = { str -> str.toUpperCase() }

printFormatterList(listOf("hello", "world")) { it.toUpperCase() }

val formatter: (String) -> String = {
  if (it.length > 2) {
    it.toUpperCase()
  } else {
    it
  }
}
listOf("a", "aa", "aaa").map(formatter) // ["a", "aa", "AAA"]

val ints = listOf(-2, -1, 0, 1, 2)
ints.filter { it > 0 } // [1, 2]

var sum = 0
ints.filter { it > 0 }.forEach {
  sum += it
}
print(sum) // 3

