package racingcar.domain

class Cars(
    val cars: List<Car>,
) {
    fun race(numberGenerator: NumberGenerator) {
        cars.forEach { car -> car.move(numberGenerator.generateNumber()) }
    }

    fun winners(): List<String> {
        val maxPosition = maxPosition()
        return cars.filter { car -> car.isSamePosition(maxPosition) }.map { car -> car.name }
    }

    private fun maxPosition() = cars.maxOf { car -> car.position }
}
