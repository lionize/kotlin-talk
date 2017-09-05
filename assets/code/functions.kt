// basic function
fun print_string(string: String): Unit {
  println(string)
}

// omit Unit return
fun print_string(string: String) {
  println(string)
}

// return type
fun echo_string(string: String): String {
  return string
}

// single-expression function
fun echo_string(string: String) = string

// default arguments
fun default_args(adjective: String = "Best", name: String = "Mark") {
  println("$adjective $name")
}
default_args() // "Best Mark"
default_args("Coolest", "Curtis") // "Coolest Curtis"
default_args(name = "David") // "Best David"
default_args(name = "Kole", adjective = "Krazy") // "Krazy Kole"

// variable number of arguments
fun printArgs(vararg items: String) {
  for (t in ts) {
    println(t)
  }
}

