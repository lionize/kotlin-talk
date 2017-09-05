// functions can take functions
fun printFormattedList(list: List<String>, format: (String) -> String) {
  for (s in list) {
    println("${format(s)}")
  }
}
fun capitalizeString(str: String) = str.toUpperCase()
printFormattedList(listOf("hello", "world"), ::capitalizeString) // "HELLO" "WORLD"
