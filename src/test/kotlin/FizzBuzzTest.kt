import org.amshove.kluent.shouldEqual
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class FizzBuzzTest {

    @ParameterizedTest
    @ValueSource(ints = intArrayOf(1, 2, 4))
    fun return_input(input: Int) {
        fizzBuzz(input) shouldEqual input.toString()
    }

    @ParameterizedTest
    @ValueSource(ints = intArrayOf(3, 6))
    fun return_Fizz_when_input_multiple_of_three(input: Int) {
        fizzBuzz(input) shouldEqual "Fizz"
    }

    @ParameterizedTest
    @ValueSource(ints = intArrayOf(5, 10))
    fun return_Buzz_when_input_multiple_of_five(input: Int) {
        fizzBuzz(input) shouldEqual "Buzz"
    }

    @ParameterizedTest
    @ValueSource(ints = intArrayOf(15, 30))
    fun return_FizzBuzz_when_input_multiple_of_three_and_five(input: Int) {
        fizzBuzz(input) shouldEqual "FizzBuzz"
    }

    fun fizzBuzz(input: Int): String {
        return FizzBuzz(input).value()
    }

}