package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.web.client.RestClientException

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
    fun shouldReturn5WhenCall5() {
        // given

        // when
        val result: Int = underTest.fibonacci(5)
        // then
        Assertions.assertEquals(5, result)
    }

    @Test
    fun shouldReturn55WhenCall10() {
        // given

        // when
        val result: Int = underTest.fibonacci(10)
        // then
        Assertions.assertEquals(55, result)
    }

    @Test
    fun shouldReturn1836311903WhenCall46() {
        // given

        // when
        val result: Int = underTest.fibonacci(46)
        // then
        Assertions.assertEquals(1836311903, result)
    }

    @Test
    fun shouldThrowWhenCall47() {
        // given

        // when
        val thrown = Assertions.assertThrows(IndexOutOfBoundsException::class.java) {
            var result = underTest.fibonacci(47)
        }

        // then
        Assertions.assertNotNull(thrown)
    }

    @Test
    fun shouldThrownWhenCallNegative() {
        // given

        // when
        val thrown = Assertions.assertThrows(IndexOutOfBoundsException::class.java) {
            var result = underTest.fibonacci(-1)
        }

        // then
        Assertions.assertNotNull(thrown)
    }




}