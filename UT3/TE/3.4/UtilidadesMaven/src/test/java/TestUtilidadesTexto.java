import com.lavado.gonzalo.UtilidadesTexto;

public class TestUtilidadesTexto {
    public static void main(String[] args) {
        System.out.println("**********************");
        System.out.println("¿La palabra \"palabra\" es un palíndromo? " + UtilidadesTexto.esPalindromo("palabra"));
        System.out.println("**********************");
        System.out.println("¿La palabra \"Anita lava la tina\" es un palíndromo? " + UtilidadesTexto.esPalindromo("Anita lava la tina"));
        System.out.println("**********************");
        System.out.println("¿Cuántas vocales tiene la palabra \"Anita lava la tina\"? " + UtilidadesTexto.contarVocales("Anita lava la tina"));
        System.out.println("**********************");
        System.out.println("¿Cuántas consonantes tiene la palabra \"Anita lava la tina\"? " + UtilidadesTexto.contarConsonantes("Anita lava la tina"));
        System.out.println("**********************");
        System.out.println("¿Cuántas palabras hay en la siguiente cadena?");
        System.out.println("Cadena: Anita lava la tina");
        System.out.println("Nº de palabras = " + UtilidadesTexto.contarPalabras("Anita lava la tina"));
        System.out.println("**********************");
        System.out.println("¿Cuántos caracteres hay en la siguiente cadena?");
        System.out.println("Cadena: Anita lava la tina");
        System.out.println("Nº de caracteres = " + UtilidadesTexto.contarCaracteres("Anita lava la tina"));
    }
}
