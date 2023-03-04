package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Int {
        return if (n == 1) 0
        else 0 // TODO instead of this logic implement fibonacci
    }
}