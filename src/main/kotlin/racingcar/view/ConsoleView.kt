package racingcar.view

import racingcar.domain.Car
import racingcar.domain.Cars

object ConsoleView {
    private const val CAR_NAME_GUIDE_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)."
    private const val CAR_NAME_DELIMITER = ","
    private const val TRY_COUNT_MESSAGE = "시도할 횟수는 몇 회인가요?"
    private const val RESULT_GUIDE_MESSAGE = "\n실행 결과"
    private const val CARS_SEPARATOR_BY_SHOW_STATUS = "\n"
    private const val SHOW_WINNER_FORMAT = "최종 우승자: %s"

    fun readCarNames(): List<Car> {
        println(CAR_NAME_GUIDE_MESSAGE)
        return readln().split(CAR_NAME_DELIMITER).map { name -> Car(name.trim()) }
    }

    tailrec fun readTryCount(): Int {
        println(TRY_COUNT_MESSAGE)
        return readln().toIntOrNull() ?: readTryCount()
    }

    fun printResultGuideMessage() {
        println(RESULT_GUIDE_MESSAGE)
    }

    fun printCars(cars: Cars) {
        println(cars.cars.joinToString(CARS_SEPARATOR_BY_SHOW_STATUS) { car -> car.toStatus() })
        println()
    }

    fun printWinners(winners: List<String>) {
        println(SHOW_WINNER_FORMAT.format(winners.joinToString { name -> name }))
    }

    private fun Car.toStatus(): String {
        return "${this.name} : ${"-".repeat(this.position)}"
    }
}
