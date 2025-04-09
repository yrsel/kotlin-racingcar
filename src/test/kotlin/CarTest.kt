import domain.Car
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class CarTest {
    @Test
    fun `자동차에 이름을 부여한다`() {
        // given
        val car = Car("chestnut")
        val expected = "chestnut"

        // when
        val actual = car.name

        // then
        Assertions.assertThat(actual).isEqualTo(expected)
    }
}
