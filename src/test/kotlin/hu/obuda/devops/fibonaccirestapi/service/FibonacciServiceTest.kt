package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.http.HttpStatus

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
    fun shouldReturn55() {
        // given

        // when
        val result: Int = underTest.fibonacci(10)
        // then
        Assertions.assertEquals(55, result)
    }// TODO - Test with greater numbers and test edge cases

    @Test
    fun shouldReturn47() {
        // given

        // when
        val result: Int = underTest.fibonacci(47)
        // then
        Assertions.assertEquals(-1323752223, result)
    }
}