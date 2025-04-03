package com.lavado.gonzalo;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesNumeros {
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
    public static boolean esImpar(int numero) {
        return numero % 2 != 0;
    }
    public static boolean esPrimo(int numero) {
        if (numero == 2) {
            return true;
        }
        if (numero % 2 == 0 || numero <= 1) {
            return false;
        }
        for (int i = 3; i <= numero/2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static double factorial(int numero) {
        double fact = 1;
        for (int i = 1; i <= numero; i++) {
            fact *= i;
        }
        return fact;
    }
    public static List<Integer> devolverDivisores(int numero) {
        List<Integer> divisores = new ArrayList<>();
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores.add(i);
            }
        }
        return divisores;
    }
    // Nº Perfecto = Suma de sus divisores (salvo el mismo)
    // Devolver divisores = Si devuelve a sí mismo
    public static boolean esPerfecto(int numero) {
        int suma = 0;

        for (Integer divisor : devolverDivisores(numero)) {
            suma += divisor;
        }

        return suma - numero == numero;
    }
}
