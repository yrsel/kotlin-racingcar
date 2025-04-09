package racingcar

import racingcar.domain.Car
import racingcar.domain.Cars
import racingcar.view.ConsoleView

class RacingGame {
    fun play() {
        val cars = cars()
    }

    private fun cars(): Cars {
        val cars: List<Car> = ConsoleView.readCarNames()
        return Cars(cars)
    }
}

fun main() {
    RacingGame().play()
}
