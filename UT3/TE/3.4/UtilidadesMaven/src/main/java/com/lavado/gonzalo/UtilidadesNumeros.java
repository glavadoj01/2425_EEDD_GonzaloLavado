package com.lavado.gonzalo;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesNumeros {
    public static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        }
        return false;
    }
    public static boolean esImpar(int numero) {
        if (numero % 2 == 0) {
            return false;
        }
        return true;
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
    public static int factorial(int numero) {
        int fact = 1;
        for (int i = 1; i <= numero; i++) {
            fact *= i;
        }
        return fact;
    }
    public static List<Integer> devolverDivisores(int numero) {
        List<Integer> divisores = new ArrayList<Integer>();
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

        if (suma - numero == numero) {
            return true;
        }
        return false;
    }
}
