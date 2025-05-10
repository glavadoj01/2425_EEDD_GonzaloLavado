package com.lavado.gonzalo.AprendiendoJUnit.ej01;

/// Clase que implementa el cálculo de la serie de Fibonacci
public class Fibonacci {
    public int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if(n == 0) {
            return 0;
        }
        if(n == 1 || n == 2) {
            return 1;
        }
        return fib(n-2) + fib(n-1);
    }
}
