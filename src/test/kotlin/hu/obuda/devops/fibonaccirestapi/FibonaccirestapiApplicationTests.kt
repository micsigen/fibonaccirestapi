package hu.obuda.devops.fibonaccirestapi

import hu.obuda.devops.fibonaccirestapi.controller.FibonacciController
import hu.obuda.devops.fibonaccirestapi.service.FibonacciService
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.web.server.ResponseStatusException

@SpringBootTest
class FibonaccirestapiApplicationTests {

	private val underTest = FibonacciController()
	@Test
	fun contextLoads() {
		assertThrows<ResponseStatusException> {
			underTest.fibonacci(47)
		}
	}

}
