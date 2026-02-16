package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()
    @Test
    fun shouldReturn1WhenCall1() {
        // given

        // when
        val result: Int = underTest.fibonacci(1)
        // then
        Assertions.assertEquals(1, result)
    }

    @Test
    fun shouldReturn1WhenCall2() {
        // given
        val n = 2

        // when
        val result = underTest.fibonacci(n)

        // then
        Assertions.assertEquals(1, result)
    }

    @Test
    fun shouldReturn55WhenCall10() {
        // given
        val n = 10

        // when
        val result = underTest.fibonacci(n)

        // then
        Assertions.assertEquals(55, result)
    }

    @Test
    fun shouldReturn0WhenCall0() {
        // given
        val n = 0

        // when
        val result = underTest.fibonacci(n)

        // then
        Assertions.assertEquals(0, result)
    }

    @Test
    fun shouldThrowExceptionWhenCallNegative1() {
        // given
        val n = -1

        // when & then
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            underTest.fibonacci(n)
        }
    }
}