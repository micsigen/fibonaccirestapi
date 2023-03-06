package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Int {
        if (n == 0) return 0;
        else if(n == 1) return 1;
        else {
            return fibonacci(n - 2) + fibonacci(n-1);
        }
        // TODO instead of this logic implement fibonacci
    }
}