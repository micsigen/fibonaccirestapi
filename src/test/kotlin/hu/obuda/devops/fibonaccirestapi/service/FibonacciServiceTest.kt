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

    // TODO - Test with greater numbers and test edge cases

    @Test
    fun shouldReturn0WhenCallMinus1() {
        val result: Int = underTest.fibonacci(-1)
        Assertions.assertEquals(0, result)
    }

    @Test
    fun shouldReturn1WhenCall2() {
        val result: Int = underTest.fibonacci(2)
        Assertions.assertEquals(1, result)
    }

    @Test
    fun shouldReturn2WhenCall3() {
        val result: Int = underTest.fibonacci(3)
        Assertions.assertEquals(2, result)
    }
}