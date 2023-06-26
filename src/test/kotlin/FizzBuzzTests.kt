import kotlin.test.Test
import kotlin.test.assertEquals

class FizzBuzzTests {
    private val testCases = mapOf(
        0 to "FizzBuzz",
        1 to "1",
        8 to "8",
        3 to "Fizz",
        6 to "Fizz",
        9 to "Fizz",
        5 to "Buzz",
        10 to "Buzz",
        20 to "Buzz",
        15 to "FizzBuzz",
        30 to "FizzBuzz",
        45 to "45"
    )

    @Test
    fun `test FizzBuzz inputs and outputs`() {
        testCases.forEach { (input, expected) ->
            assertEquals(expected, fizzBuzz(input))
        }
    }
}