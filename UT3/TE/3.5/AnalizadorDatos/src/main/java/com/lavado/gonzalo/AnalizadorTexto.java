package com.lavado.gonzalo;

import com.gordillo.daniel.UtilidadesTextos;

public class AnalizadorTexto {
    public static void analizadorTexto(String texto) {
        System.out.println("Análisis del texto: \"" + texto + '\"');
        System.out.println("- ¿Es palíndromo? " + UtilidadesTextos.esPalindromo(texto));
        System.out.println("- Número de vocales: " + UtilidadesTextos.contarVocales(texto));
        System.out.println("- Número de consonantes: " + UtilidadesTextos.contarConsonantes(texto));
        System.out.println("- Número de palabras: " + UtilidadesTextos.contarPalabras(texto));
        System.out.println("- Número de caracteres (sin espacios): " + UtilidadesTextos.contarCaracteres(texto));
    }
}