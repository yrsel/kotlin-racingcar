import domain.Car
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class CarTest {
    @Test
    fun `자동차에 이름을 부여한다`() {
        // given
        val car = Car("chestnut", 0)
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
        val car = Car("chestnut", 0)
        val expected = 1

        // when
        car.move(number)
        val actual = car.position

        // then
        Assertions.assertThat(actual).isEqualTo(expected)
    }
}
