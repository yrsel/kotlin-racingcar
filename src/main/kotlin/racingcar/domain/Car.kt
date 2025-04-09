package racingcar.domain

class Car(val name: String, position: Int = INIT_POSITION) {
    var position: Int = position
        private set

    fun move(number: Int) {
        if (isMovable(number)) position++
    }

    private fun isMovable(number: Int): Boolean {
        return number in MOVABLE_LOWER_BOUND..MOVABLE_UPPER_BOUND
    }

    fun isSamePosition(position: Int): Boolean {
        return this.position == position
    }

    companion object {
        private const val INIT_POSITION = 0
        private const val MOVABLE_LOWER_BOUND = 4
        private const val MOVABLE_UPPER_BOUND = 9
    }
}
