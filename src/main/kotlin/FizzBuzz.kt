fun fizzBuzz(input: Int) = when {
    input.isDivisibleBy(15) -> "FizzBuzz"
    input.isDivisibleBy(3) -> "Fizz"
    input.isDivisibleBy(5) -> "Buzz"
    else -> input.toString()
}

private fun Int.isDivisibleBy(divisor: Int) = this % divisor == 0