data class Rule(
        private val condition: (Int) -> Boolean,
        val result: String
) {

    fun apply(number: Int): Boolean {
        return condition.invoke(number)
    }

}