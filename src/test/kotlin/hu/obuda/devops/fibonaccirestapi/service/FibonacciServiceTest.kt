package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()

    @Test
    fun shouldReturn0WhenCall0() {
        // given

        // when
        val result: Int = underTest.fibonacci(0)
        // then
        Assertions.assertEquals(0, result)
    }

    @Test
    fun shouldReturn0WhenCall1() {
        // given

        // when
        val result: Int = underTest.fibonacci(1)
        // then
        Assertions.assertEquals(1, result)
    }

    @Test
    fun shouldReturn2WhenCall3() {
        // given

        // when
        val result: Int = underTest.fibonacci(3)
        // then
        Assertions.assertEquals(2, result)
    }

    @Test
    fun shouldReturnBadRequestWhenCallWith46() {
        // given

        // when
        val result: Int = underTest.fibonacci(46)
        // then
        Assertions.assertEquals(1836311903, result)
    }
}