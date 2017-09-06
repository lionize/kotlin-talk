fun printString(string: String): Unit {
  println(string)
}

fun printString(string: String) {
  println(string)
}

fun echoString(string: String): String {
  return string
}

fun echoString(string: String) = string

fun defaultArgs(adjective: String = "Best", name: String = "Mark") {
  println("$adjective $name")
}
defaultArgs() // "Best Mark"
defaultArgs("Coolest", "Curtis") // "Coolest Curtis"
defaultArgs(name = "David") // "Best David"
defaultArgs(name = "Kole", adjective = "Krazy") // "Krazy Kole"

fun printArgs(vararg items: String) {
  for (i in items) {
    println(i)
  }
}
printArgs("hello", "world") // "hello" "world"

