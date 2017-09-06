enum class Direction {
  NORTH, SOUTH, WEST, EAST
}
val currentDirection = Direction.NORTH

enum class Direction(val distance: String) {
  NORTH("far"),
  SOUTH("near"),
  WEST("super near"),
  EAST("super far")
}
val direction = Direction.SOUTH
println(direction) // SOUTH
println(direction.distance) // near

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
