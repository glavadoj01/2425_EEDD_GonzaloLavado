package com.lavado.gonzalo;

import java.util.Arrays;

public class UtilidadesTexto {
    public static boolean esPalindromo(String palabra) {
        for (int i = 0; i < palabra.length()/2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static int contarVocales(String palabra) {
        int vocales = 0;
        palabra = palabra.toLowerCase();
        for (Character c : palabra.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            }
        }
        return vocales;
    }
    public static int contarConsonantes(String palabra) {
        int consonantes = 0;
        for (Character c : palabra.toCharArray()) {
            if (Character.isLetter(c)) {
                consonantes++;
            }
        }
        return consonantes - contarVocales(palabra);
    }
    public static int contarPalabras(String cadena) {
        int palabras = 0;
        for (Character c : cadena.toCharArray()) {
            if (c == ' ') { // Se asume un espacio como separador
                palabras++;
            }
        }
        return palabras;
    }
    // Alternativa => Indicar Cadena + Separador
    public static int contarPalabras (String cadena, String separador) {
        return Arrays.asList(cadena.split(separador)).size();
    }
}
