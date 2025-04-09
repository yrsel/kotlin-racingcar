package racingcar

import racingcar.domain.Car
import racingcar.domain.Cars
import racingcar.domain.NumberGenerator
import racingcar.domain.RandomNumberGenerator
import racingcar.view.ConsoleView

class RacingGame {
    fun play() {
        val cars = cars()
        val tryCount = tryCount()

        ConsoleView.printResultGuideMessage()
        race(tryCount, cars, RandomNumberGenerator())

        ConsoleView.printWinners(cars.winners())
    }

    private fun cars(): Cars {
        val cars: List<Car> = ConsoleView.readCarNames()
        return Cars(cars)
    }

    private fun tryCount(): Int {
        return ConsoleView.readTryCount()
    }

    private tailrec fun race(
        tryCount: Int,
        cars: Cars,
        numberGenerator: NumberGenerator,
    ) {
        if (tryCount == GAME_END) return
        cars.race(numberGenerator)
        ConsoleView.printCars(cars)
        race(tryCount - 1, cars, numberGenerator)
    }

    companion object {
        private const val GAME_END = 0
    }
}

fun main() {
    RacingGame().play()
}
