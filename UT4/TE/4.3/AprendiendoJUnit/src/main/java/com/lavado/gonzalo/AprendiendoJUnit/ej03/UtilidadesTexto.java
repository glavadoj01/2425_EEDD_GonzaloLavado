package com.lavado.gonzalo.AprendiendoJUnit.ej03;

public class UtilidadesTexto {
    public static boolean esPalindromo(String palabra) {
        palabra = devolverStandar(palabra);
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
        palabra = devolverStandar(palabra);
        for (Character c : palabra.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            }
        }
        return vocales;
    }
    public static int contarConsonantes(String palabra) {
        palabra = palabra.replaceAll(" ", "");
        return contarCaracteres(palabra) - contarVocales(palabra);
    }
    public static int contarPalabras(String cadena) {
        if (cadena.isEmpty()) {
            return 0;
        }
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

    private static String devolverStandar(String palabra) {
        palabra = palabra.toLowerCase();
        palabra = palabra.replaceAll("á", "a");
        palabra = palabra.replaceAll("é", "e");
        palabra = palabra.replaceAll("í", "i");
        palabra = palabra.replaceAll("ó", "o");
        palabra = palabra.replaceAll("ú", "u");
        return palabra;
    }
}
