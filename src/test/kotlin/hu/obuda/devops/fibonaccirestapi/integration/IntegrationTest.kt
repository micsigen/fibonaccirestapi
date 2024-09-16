package hu.obuda.devops.fibonaccirestapi.integration

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpStatus
import org.springframework.web.client.RestClientException
import org.springframework.web.client.RestTemplate

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class IntegrationTest {

    var restTemplate = RestTemplate()

    @Test
    fun callFibonacciEndpoint() {
        // given

        // when
        val entity = restTemplate.getForEntity(
            "http://localhost:8080/fibonacci?n=1",
            String::class.java
        )

        // then
        Assertions.assertEquals(HttpStatus.OK, entity.statusCode)
        Assertions.assertEquals("1", entity.body)
    }

    @Test
    @Throws(Exception::class)
    fun callFibonacciEndpointWithInvalid() {
        // given

        // when
        val thrown = Assertions.assertThrows(
            RestClientException::class.java
        ) {
            restTemplate.getForEntity(
                "http://localhost:8080/fibonacci?n=47",
                String::class.java
            )
        }

        // then
        Assertions.assertNotNull(thrown)
    }

}