when (x) {
  1 -> print("$x == 1")
  2 -> print("$x == 2")
  3 -> print("$x == 3")
  else -> { // required in case not all match
    print("$x is neither 1 nor 2 nor 3")
  }
}

when (x) {
  1, 2 -> print("$x == 1 || $x == 2")
  else -> print("$x is neither 1 nor 2")
}

when (x) {
  in 1..10 -> print("$x is in the range 1..10")
  else -> print("$x is outside the range 1..10")
}

val validNumbers = listOf(1, 2, 3)
val x = 2
when (x) {
  in validNumbers -> print("$x is valid")
  else -> print("$x is not in list of valid numbers ($validNumbers)")
}

fun hasPrefix(x: Any) = when (x) {
  is String -> x.startsWith("prefix")
  else -> false
}

when {
  x.isOdd() -> print("x is odd")
  x.isEven() -> print("x is even")
  else -> print("x is funny")
}
