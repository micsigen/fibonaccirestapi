package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()
    @ParameterizedTest
    @CsvSource("1, 1",
               "2, 1",
               "3, 2",
               "4, 3",
               "5, 5",
               "6, 8",
               "46, 1836311903")
    fun shouldReturn0WhenCall1(n: Int, expectedResult: Int ) {
        // given

        // when
        val result: Int = underTest.fibonacci(n)
        // then
        Assertions.assertEquals(expectedResult, result)
    }
}