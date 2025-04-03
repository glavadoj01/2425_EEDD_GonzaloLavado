package com.lavado.gonzalo;

import java.text.DecimalFormat;

public class AnalizadorNumerico {
    public static void analizaNumerico(int num) {
        DecimalFormat df = new DecimalFormat("#");

        System.out.println("Análisis del número: " + num);
        System.out.println("¿Es par? " + UtilidadesNumeros.esPar(num));
        System.out.println("¿Es impar? " + UtilidadesNumeros.esImpar(num));
        System.out.println("¿Es primo? " + UtilidadesNumeros.esPrimo(num));
        System.out.println("Factorial: " + df.format(UtilidadesNumeros.factorial(num)));
        System.out.println("Divisores: " + UtilidadesNumeros.devolverDivisores(num));
        System.out.println("¿Es perfecto? " + UtilidadesNumeros.esPerfecto(num));
    }
}
