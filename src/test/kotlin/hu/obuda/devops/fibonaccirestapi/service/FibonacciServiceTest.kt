package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.Assertions.assertEquals


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()
    @Test
    fun shouldReturn0WhenCall1() {
        // given

        // when
        val result: Int = underTest.fibonacci(1)
        // then
        Assertions.assertEquals(0, result)
    }

    @Test
    fun shouldReturn1836311903WhenCall46() {
        // given

        // when
        val result = underTest.fibonacci(46)

        // then
        assertEquals(1134903170, result)
    }

    @Test
    fun shouldReturnBadRequestWhenCall47() {
        // given

        // when
        val result = underTest.fibonacci(47)

        // then
        assertEquals("n cannot be greater than 46", result)
    }
    // TODO - Test with greater numbers and test edge cases
    
}