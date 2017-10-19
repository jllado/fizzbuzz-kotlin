class FizzBuzz(
        private val number: Int
) {

    private val rules: List<Rule> = listOf(
            Rule({number -> number.isDivisibleBy(3, 5)}, "FizzBuzz"),
            Rule({number -> number.isDivisibleBy(3)}, "Fizz"),
            Rule({number -> number.isDivisibleBy(5)}, "Buzz"))

    fun value(): String =
        rules.filter { rule -> rule.apply(number) }.map { rule -> rule.result }.firstOrNull() ?: number.toString()

}

private fun Int.isDivisibleBy(vararg numbers: Int): Boolean = numbers.all { isDivisibleBy(it) }

private fun Int.isDivisibleBy(number: Int) = this.rem(number) == 0
