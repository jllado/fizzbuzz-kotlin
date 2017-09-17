data class FizzBuzz(
        private val number: Int
) {
    fun value(): String {
        if (number.isDivisibleBy(3) && number.isDivisibleBy(5)) {
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

private fun Int.isDivisibleBy(number: Int): Boolean {
    return this.rem(number) == 0
}
