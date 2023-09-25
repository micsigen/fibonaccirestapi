package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Int {
        return fibonacciCalculation(n)
    }

    fun fibonacciCalculation(n: Int): Int{
        var previous = 1
        var current = 1

        for(i in n downTo 3){
            val tmp = current
            current += previous
            previous = tmp
        }

        return current
    }
}