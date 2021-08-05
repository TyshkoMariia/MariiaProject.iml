package com.example.mariiaproject;

public class FibonacciClass {
    int k;
    int[] fib = new int[11];
    public void FIbCalculate () {
        for (k=2; k<=10; k++) {
            fib[0] = 1;
            fib[1] = 1;
            fib[k] = fib[k-2] + fib[k-1];
        }
        System.out.println(fib[10]);
    }
}
