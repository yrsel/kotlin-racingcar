package racingcar.domain

class Car(val name: String, position: Int) {
    var position = position
        private set

    fun move(number: Int) {
        if (number in MOVABLE_LOWER_BOUND..MOVABLE_UPPER_BOUND) {
            position++
        }
    }

    fun isSamePosition(position: Int): Boolean {
        return this.position == position
    }

    companion object {
        private const val MOVABLE_LOWER_BOUND = 4
        private const val MOVABLE_UPPER_BOUND = 9
    }
}
