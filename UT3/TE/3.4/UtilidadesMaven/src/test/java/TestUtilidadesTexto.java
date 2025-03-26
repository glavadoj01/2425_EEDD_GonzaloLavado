import com.lavado.gonzalo.UtilidadesTexto;

public class TestUtilidadesTexto {
    public static void main(String[] args) {
        System.out.println("**********************");
        System.out.println("¿La palabra \"palabra\" es un palíndromo? " + UtilidadesTexto.esPalindromo("palabra"));
        System.out.println("**********************");
        System.out.println("¿La palabra \"ABACABA\" es un palíndromo? " + UtilidadesTexto.esPalindromo("ABACABA"));
        System.out.println("**********************");
        System.out.println("¿Cuántas vocales tiene la palabra \"Abecedario\"? " + UtilidadesTexto.contarVocales("Abecedario"));
        System.out.println("**********************");
        System.out.println("¿Cuántas consonantes tiene la palabra \"Abecedario\"? " + UtilidadesTexto.contarConsonantes("Abecedario"));
        System.out.println("**********************");
        System.out.println("¿Cuántas palabras hay en la siguiente cadena?");
        System.out.println("Cadena: Abecedario Vocales Consonantes Palíndromo");
        System.out.println("Nº de palabras = " + UtilidadesTexto.contarPalabras("Abecedario Vocales Consonantes Palíndromo"));
        System.out.println("**********************");
        System.out.println("¿Cuántas palabras hay en la siguiente cadena?");
        System.out.println("Cadena: Abecedario/Vocales/Consonantes/Palíndromo");
        System.out.println("Nº de palabras = " + UtilidadesTexto.contarPalabras("Abecedario/Vocales/Consonantes/Palíndromo","/"));
    }
}
