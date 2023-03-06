package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Int {
        if(n<0)
            throw IndexOutOfBoundsException();

        if(n>46)
            throw IndexOutOfBoundsException();
        return if (n <= 1) n
        else return fibonacci(n-1)+fibonacci(n-2)
    }
}