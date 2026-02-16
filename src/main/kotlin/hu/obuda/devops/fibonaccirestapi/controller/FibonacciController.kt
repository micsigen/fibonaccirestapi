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
    var fibonacciService: FibonacciService? = null

    @GetMapping(value = ["fibonacci"])
    open fun fibonacci(@RequestParam n: Int): ResponseEntity<Int> {

        if (n > 46 || n < 1) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build()
        }

        val result = fibonacciService!!.fibonacci(n)
        return ResponseEntity.ok(result)
    }
}