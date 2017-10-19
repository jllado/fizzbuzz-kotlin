data class FizzBuzz(
        private val number: Int
) {
    fun value(): String {
        if (number.isDivisibleBy(3, 5)) {
            return "FizzBuzz"
        }
        if (number.isDivisibleBy(5)) {
            return "Buzz"
        }
        if (number.isDivisibleBy(3)) {
            return "Fizz"
        }
        return number.toString()
    }
}

private fun Int.isDivisibleBy(vararg numbers: Int): Boolean = numbers.all { isDivisibleBy(it) }

private fun Int.isDivisibleBy(number: Int) = this.rem(number) == 0
