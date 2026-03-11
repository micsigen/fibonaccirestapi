package hu.obuda.devops.fibonaccirestapi.controller

import hu.obuda.devops.fibonaccirestapi.service.FibonacciService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class FibonacciController {

    @Autowired
    lateinit var fibonacciService: FibonacciService

    @GetMapping("fibonacci")
    fun fibonacci(@RequestParam n: Int): ResponseEntity<Int> {
        return if (n > 46) {
            ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(null) // vagy üzenetet is küldhetsz külön wrapperrel
        } else {
            val result = fibonacciService.fibonacci(n)
            ResponseEntity.ok(result)
        }
    }
}
