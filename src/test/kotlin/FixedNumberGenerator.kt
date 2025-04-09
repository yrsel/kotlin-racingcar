import domain.NumberGenerator

class FixedNumberGenerator(
    private val numbers: List<Int>,
) : NumberGenerator {
    private var index = INIT_INDEX

    override fun generateNumber(): Int {
        val fixedNumber = numbers[index++]
        if (isLastIndex()) index = INIT_INDEX
        return fixedNumber
    }

    private fun isLastIndex(): Boolean {
        return index == numbers.size
    }

    companion object {
        private const val INIT_INDEX = 0
    }
}
