package hu.obuda.devops.fibonaccirestapi.controller

import hu.obuda.devops.fibonaccirestapi.service.FibonacciService
import io.netty.handler.codec.http.HttpResponseStatus
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.net.http.HttpResponse

@RestController
@RequestMapping("/")
class FibonacciController {

    @Autowired
    var fibonacciService: FibonacciService? = null

    @GetMapping(value = ["fibonacci"])
    open fun fibonacci(@RequestParam n: Int): Int? {
        // TODO - If n is greater than 46 then return BAD REQUEST use HttpStatus
        if(n > 46)
            HttpResponseStatus(400, "BAD REQUEST")
            //HttpStatus(400, "Bad Request")
            //return HttpResponse(400) //'BAD REQUEST'
        else
        return fibonacciService?.fibonacci(n)

    }
}