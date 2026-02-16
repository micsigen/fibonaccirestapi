package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Int {
        require(n >= 0) { "n must be non-negative" }
        if (n <= 1) return n

        var a = 0
        var b = 1

        repeat(n - 1) {
            val next = a + b
            a = b
            b = next
        }

        return b
    }
}