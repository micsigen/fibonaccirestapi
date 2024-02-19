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
        Assertions.assertEquals(0, result)
    }

    private val Test2 = FibonacciService()
    @Test
    fun shouldReturn0WhenCall2() {
        // given

        // when
        val result: Int = Test2.fibonacci(-1)
        // then
        Assertions.assertEquals(0, result)
    }

    private val Test3 = FibonacciService()
    @Test
    fun shouldReturnCorrectAnswerWhenCall() {
        // given

        // when
        val result: Int = Test3.fibonacci(2)
        // then
        Assertions.assertEquals(1, result)
    }



    // TODO - Test with greater numbers and test edge cases
}