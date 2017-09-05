// pattern matching 'switch'
when (x) {
  1, 2 -> print("x == 1 or x == 2")
  3 -> print("x == 3")
  else -> { // required in case not all match
    print("x is neither 1 nor 2 nor 3")
  }
}

// check range
when (x) {
  in 1..10 -> print("x is in the range")
  in validNumbers -> print("x is valid")
  !in 10..20 -> print("x is outside the range")
  else -> print("none of the above")
}

// smart casts
fun hasPrefix(x: Any) = when(x) {
  is String -> x.startsWith("prefix")
  else -> false
}

// conditional
when {
  x.isOdd() -> print("x is odd")
  x.isEven() -> print("x is even")
  else -> print("x is funny")
}
