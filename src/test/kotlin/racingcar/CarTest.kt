package racingcar

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import racingcar.domain.Car

class CarTest {
    private lateinit var chestnutCar: Car

    @BeforeEach
    fun setUp() {
        chestnutCar = Car("chestnut", 0)
    }

    @Test
    fun `자동차에 이름을 부여한다`() {
        // given
        val car = chestnutCar
        val expected = "chestnut"

        // when
        val actual = car.name

        // then
        Assertions.assertThat(actual).isEqualTo(expected)
    }

    @ParameterizedTest
    @ValueSource(ints = [4, 5, 6, 7, 8, 9])
    fun `자동차는 4 이상 9 이하 숫자가 들어온다면 이동거리가 1 증가한다`(number: Int) {
        // given
        val car = chestnutCar
        val expected = 1

        // when
        car.move(number)
        val actual = car.position

        // then
        Assertions.assertThat(actual).isEqualTo(expected)
    }

    @ParameterizedTest
    @ValueSource(ints = [0, 1, 2, 3])
    fun `자동차는 4 미만의 숫자가 들어올 경우 이동하지 않는다`(number: Int) {
        // given
        val car = chestnutCar
        val expected = 0

        // when
        car.move(number)
        val actual = car.position

        // then
        Assertions.assertThat(actual).isEqualTo(expected)
    }
}
