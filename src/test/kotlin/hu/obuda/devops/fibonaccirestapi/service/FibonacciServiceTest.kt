package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()
    @Test
    fun shouldReturn0WhenCall0() {
        val result = underTest.fibonacci(0)
        Assertions.assertEquals(0, result)
    }

    @Test
    fun shouldReturn1WhenCall1() {
        val result = underTest.fibonacci(1)
        Assertions.assertEquals(1, result)
    }

    @Test
    fun shouldReturn1WhenCall2() {
        val result = underTest.fibonacci(2)
        Assertions.assertEquals(1, result)
    }

    @Test
    fun shouldReturn2WhenCall3() {
        val result = underTest.fibonacci(3)
        Assertions.assertEquals(2, result)
    }

    @Test
    fun shouldReturn3WhenCall4() {
        val result = underTest.fibonacci(4)
        Assertions.assertEquals(3, result)
    }

    @Test
    fun shouldReturn5WhenCall5() {
        val result = underTest.fibonacci(5)
        Assertions.assertEquals(5, result)
    }

    @Test
    fun shouldReturn8WhenCall6() {
        val result = underTest.fibonacci(6)
        Assertions.assertEquals(8, result)
    }

    @Test
    fun shouldReturn13WhenCall7() {
        val result = underTest.fibonacci(7)
        Assertions.assertEquals(13, result)
    }

    @Test
    fun shouldReturn21WhenCall8() {
        val result = underTest.fibonacci(8)
        Assertions.assertEquals(21, result)
    }

    @Test
    fun shouldReturn34WhenCall9() {
        val result = underTest.fibonacci(9)
        Assertions.assertEquals(34, result)
    }

    @Test
    fun shouldReturn55WhenCall10() {
        val result = underTest.fibonacci(10)
        Assertions.assertEquals(55, result)
    }
    // TODO - Test with greater numbers and test edge cases
}