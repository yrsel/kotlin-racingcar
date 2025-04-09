package racingcar.view

import racingcar.domain.Car

object ConsoleView {
    private const val CAR_NAME_GUIDE_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)."
    private const val CAR_NAME_DELIMITER = ","

    fun readCarNames(): List<Car> {
        println(CAR_NAME_GUIDE_MESSAGE)
        return readln().split(CAR_NAME_DELIMITER).map { name -> Car(name.trim()) }
    }
}
