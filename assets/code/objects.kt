// object expressions -- anonymous class that inherits from some type(s)
window.addMouseListener(object : MouseAdapter() {
  override fun mouseClick(e: MouseEvent) {
    // ...
  }

  override fun mouseEntered(e: MouseEvent) {
    // ...
  }
})

// can hold properties
val adHoc = object {
  var x: Int = 0
  var y: Int = 0
}

// can access enclosing scope
fun countClicks(window: JComponent) {
  var clickCount = 0
  var enterCount = 0

  window.addMouseListener(object : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent) {
      clickCount++
    }

    override fun mouseEntered(e: MouseEvent) {
      enterCount++
    }
  })
}

// object declaration -- singleton
object DataProviderManager {
  fun registerDataProvider(provider: DataProvider) {
    // ...
  }

  val allDataProviders: Collection<DataProvider>
    get() = // ...
}
DataProviderManager.registerDataProvider(...)

// companion objects
class MyClass {
  companion object Factory {
    fun create(): MyClass = MyClass()
  }
}
// call members using class name as qualifier
val instance = MyClass.create()

// look like static members but are instances members of real objects
// can implement interfaces
interface Factory<T> {
  fun create(): T
}

class MyClass {
  companion object : Factory<MyClass> {
    override fun create(): MyClass = MyClass()
  }
}

