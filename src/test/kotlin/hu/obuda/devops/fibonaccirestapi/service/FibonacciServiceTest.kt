package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()
    @Test
    fun shouldReturn0WhenCall1() {
        // given

        // when
        val result: Int = underTest.fibonacci(1)
        // then
        Assertions.assertEquals(1, result)
    }

    @Test
    fun Fibonacci_Should_Return34() {

        val result: Int = underTest.fibonacci(9)

        Assertions.assertEquals(34, result);
    }

    @Test
    fun Fibonacci_Should_Return0() {

        var result: Int = underTest.fibonacci(0)
        Assertions.assertEquals(0, result);

        result = underTest.fibonacci(-1)
        Assertions.assertEquals(0, result);
    }
}