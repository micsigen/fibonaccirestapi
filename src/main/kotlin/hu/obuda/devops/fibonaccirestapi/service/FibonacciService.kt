package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Int {
        return if (n <= 1) n
        else (fibonacci(n-1) + fibonacci(n-2))
    }
}