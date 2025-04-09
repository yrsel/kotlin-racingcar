package racingcar.domain

import kotlin.random.Random

class RandomNumberGenerator : NumberGenerator {
    override fun generateNumber(): Int {
        return Random.nextInt(NUMBER_LOWER_BOUND, NUMBER_UPPER_BOUND)
    }

    companion object {
        private const val NUMBER_LOWER_BOUND = 0
        private const val NUMBER_UPPER_BOUND = 9
    }
}
