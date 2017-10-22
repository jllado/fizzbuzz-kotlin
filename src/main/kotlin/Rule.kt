data class Rule(
        private val condition: (Int) -> Boolean,
        val result: String
) {

    fun applyFor(number: Int): Boolean {
        return condition.invoke(number)
    }

}