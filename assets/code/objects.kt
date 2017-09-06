val adHoc = object {
  var x: Int = 0
  var y: Int = 0
}

window.addMouseListener(object : MouseAdapter() {
  override fun mouseClick(e: MouseEvent) {
    // ...
  }

  override fun mouseEntered(e: MouseEvent) {
    // ...
  }
})

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

object DataProviderManager {
  fun registerDataProvider(provider: DataProvider) {
    // ...
  }

  val allDataProviders: Collection<DataProvider>
    get() = // ...
}
DataProviderManager.registerDataProvider(...)

class MyClass {
  companion object Factory {
    fun create(): MyClass = MyClass()
  }
}
val instance = MyClass.create()

interface Factory<T> {
  fun create(): T
}

class MyClass {
  companion object : Factory<MyClass> {
    override fun create(): MyClass = MyClass()
  }
}

