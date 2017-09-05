enum class Direction {
  NORTH, SOUTH, WEST, EAST
}

// enum classes can be initialized
enum class Direction(val distance: String) {
  NORTH("far"),
  SOUTH("near"),
  WEST("super near"),
  EAST("super far")
}

// use enum constants as anonymous classes
enum class ProtocolState {
  WAITING {
    override fun signal() = TALKING
  },

  TALKING {
    override fun signal() = WAITING
  };

  abstract fun signal(): ProtocolState
}
val state = ProtocolState.WAITING
println(state.signal()) // TALKING
