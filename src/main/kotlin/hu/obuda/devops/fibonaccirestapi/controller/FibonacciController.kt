package hu.obuda.devops.fibonaccirestapi.controller

import hu.obuda.devops.fibonaccirestapi.service.FibonacciService
import jdk.jshell.Snippet.Status
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/")
class FibonacciController {

    @Autowired
    var fibonacciService: FibonacciService? = null

    @GetMapping(value = ["fibonacci"])
    open fun fibonacci(@RequestParam n: Int) : Int? {
        if (n > 46 || n < 0)
            throw ResponseStatusException(HttpStatus.BAD_REQUEST);
        return fibonacciService?.fibonacci(n);
    }

    /*@GetMapping(value = ["fibonacci"])
    open fun fibonacci(@RequestParam n: Int) : ResponseEntity<Int> {
        if (n > 46)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(0);
        return ResponseEntity.ok(fibonacciService?.fibonacci(n));
    }*/
}