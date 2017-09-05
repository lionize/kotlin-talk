// basic lambda/anonymous function
fun printFormattedList(list: List<String>, format: (String) -> String) {
  for (s in list) {
    println("${format(s)}")
  }
}

val formatter = { str: String -> str.toUpperCase() }

printFormattedList(listOf("hello", "world"), formatter)

// define type
val formatter: (String) -> String = { str -> str.toUpperCase() }

// lambdas return like expression
val formatter: (String) -> String = {
  if (it.length > 2) {
    it.toUpperCase()
  } else {
    it
  }
}
listOf("a", "aa", "aaa").map(formatter) // ["a", "aa", "AAA"]

// qualified return
val ints = listOf(1, 2, 3)
ints.filter {
  val shouldFilter = it > 0
  shouldFilter
}

ints.filter {
  val shouldFilter = it > 0
  // returns from outer function if qualified return not used
  return@fitler shouldFilter
}

// lambda outside of function call if last parameter
printFormatterList(listOf("hello", "world")) { it.toUpperCase() }


// use 'it' for single-parameter lambdas
val ints = listOf(-2, -1, 0, 1, 2)
ints.filter { it > 0 } // [1, 2]

// lambdas can access closure (variables declared in outer scope)
var sum = 0
ints.filter { it > 0 }.forEach {
  sum += it
}
print(sum) // 3

// qualified return

// functions with receiver objects
class HTML {
  var text = "<div></div>"
  fun body(content: String) {
    text = content
    return text
  }
}

fun html(init: HTML.() -> Unit): HTML {
  val html = HTML() // create receiver object
  println(html.text) // <div></div>
  html.init() // pass receiver object to lambda
  return html
}

val content = html {
  body("<p>Hello World</p>")
}
println(content.text) // <p>Hello World</p>
