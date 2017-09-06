val a = true
if (a) {
  println("Truth!")
} else {
  println("Objection!")
}

println(if (a) "Truth!" else "Falsity!")
val outcome = if (a) "Yes" else "No"

val b = 20
val result = if (b > 10) {
  10
} else {
  0
}
println(result) // 10
