package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Int {
        require(n >= 1) { "n must be at least 1" }

        return when (n) {
            1 -> 0
            2 -> 1
            else -> fibonacci(n - 1) + fibonacci(n - 2)
        }
    }

}