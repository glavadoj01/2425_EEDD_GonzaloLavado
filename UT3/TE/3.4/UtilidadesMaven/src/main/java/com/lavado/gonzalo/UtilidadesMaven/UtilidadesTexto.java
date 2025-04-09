package com.lavado.gonzalo.UtilidadesMaven;

public class UtilidadesTexto {
    public static boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase();
        palabra = palabra.replaceAll(" ", "");
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
        return contarCaracteres(palabra) - contarVocales(palabra);
    }
    public static int contarPalabras(String cadena) {
        return cadena.split(" ").length;
    }
    // Alternativa => Indicar Cadena + Separador
    public static int contarCaracteres (String cadena) {
        int cont = 0;
        for (Character c : cadena.toCharArray()) {
            if (Character.isLetter(c)) {
                cont++;
            }
        }
        return cont;
    }
}
