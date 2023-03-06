package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Any {
        return if (n == 1) {
            0
        } else if (n > 46) {
            "n cannot be greater than 46"
        } else {
            var a = 0
            var b = 1
            repeat(n - 2) {
                val c = a + b
                a = b
                b = c
            }
            b
        }
    }
}

