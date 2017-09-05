import java.util.*

fun demo(source: List<Int>) {
  val list = ArrayList<Int>()

  for (item in source) {
    list.add(item)
  }

  for (i in 0..source.size - 1) {
    list[i] = source[i] // get and set are called
  }
}

// getters and setters represented in Kotlin as properties
import java.util.Calendar

fun calendarDemo() {
  val calendar = Calendar.getInstance()
  if (calendar.firstDayOfWeek == Calendar.SUNDAY) {
    // call getFirstDayOfWeek()
    calendar.firstDayOfWeek = Calendar.MONDAY
    // call setFirstDayOfWeek()
  }

  if (!calendar.isLenient) {
    // call isLenient()
    calendar.isLenient = true
    // call setLenient()
  }
}

// escaping Java identifiers that are keywords in Kotlin -- escape with backtick
foo.`is`(bar)
foo.`in`(bar)
