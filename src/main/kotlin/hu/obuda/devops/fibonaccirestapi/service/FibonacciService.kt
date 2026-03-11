package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Int {
        if(n <= 0)
            return 0
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2); // TODO instead of this logic implement fibonacci
    }
}