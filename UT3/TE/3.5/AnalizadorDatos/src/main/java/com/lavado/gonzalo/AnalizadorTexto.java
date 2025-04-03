package com.lavado.gonzalo;

public class AnalizadorTexto {
    public static void analizadorTexto(String texto) {
        System.out.println("Análisis del texto: \"" + texto + '\"');
        System.out.println("- ¿Es palíndromo? " + UtilidadesTexto.esPalindromo(texto));
        System.out.println("- Número de vocales: " + UtilidadesTexto.contarVocales(texto));
        System.out.println("- Número de consonantes: " + UtilidadesTexto.contarConsonantes(texto));
        System.out.println("- Número de palabras: " + UtilidadesTexto.contarPalabras(texto));
        System.out.println("- Número de caracteres (sin espacios): " + UtilidadesTexto.contarCaracteres(texto));
    }
}