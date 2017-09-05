// Any is implicit superclass of all
class Example // implicitly inherits from Any

// declare explicit supertype
open class Base(p: Int)

class Derived(p: Int) : Base(p) // not initialization must occur here

// if no primary constructor, must initialize to base using super
class MyView : View {
  constructor(ctx: Context) : super(ctx)

  constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
}

// overriding methods
open class Base { // closed by default
  open fun v() {}
  fun nv() {}
}
class Derived() : Base() {
  override fun v() {}

  // cannot re-use closed nv, overridden or not
  fun nv() {}
  override fun nv() {}
}

// overriding properties
open class Foo {
  open val x: Int get() { ... }
}

class Bar1 : Foo() {
  override val x: Int = ...
}
// OR
class Bar1(override val count: Int) : Foo()
