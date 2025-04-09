package racingcar

import racingcar.domain.Car
import racingcar.domain.Cars
import racingcar.view.ConsoleView

class RacingGame {
    fun play() {
        val cars = cars()
        val tryCount = tryCount()
    }

    private fun cars(): Cars {
        val cars: List<Car> = ConsoleView.readCarNames()
        return Cars(cars)
    }

    private fun tryCount(): Int {
        return ConsoleView.readTryCount()
    }
}

fun main() {
    RacingGame().play()
}
