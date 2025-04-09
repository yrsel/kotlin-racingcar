package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.Car
import racingcar.domain.Cars

class CarsTest {
    @Test
    fun `가장 멀리 간 우승자를 판단한다`() {
        val cars =
            Cars(
                listOf(
                    Car("Player1", 0),
                    Car("Player2", 0),
                    Car("Player3", 0),
                ),
            )
        val numberGenerator = FixedNumberGenerator(listOf(0, 4, 4))
        cars.race(numberGenerator)
        cars.race(numberGenerator)
        cars.race(numberGenerator)
        val expected = listOf("Player2", "Player3")

        val actual = cars.winners()

        assertThat(actual).isEqualTo(expected)
    }
}
