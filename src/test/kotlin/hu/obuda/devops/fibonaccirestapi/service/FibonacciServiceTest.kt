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
    fun shouldReturn0WhenCall1() {
        // given

        // when
        val result: Int = underTest.fibonacci(1)
        // then
        Assertions.assertEquals(1, result)
    }

    @Test
    fun test46EdgeCase(){
        //given

        //when
        val result: Int = underTest.fibonacci(46)

        //then
        Assertions.assertEquals(1836311903, result)
    }

    @Test
    fun shouldReturn55WhenCall10() {
        // given

        // when
        val result: Int = underTest.fibonacci(10)
        // then
        Assertions.assertEquals(55, result)
    }

    // TODO - Test with greater numbers and test edge cases
}