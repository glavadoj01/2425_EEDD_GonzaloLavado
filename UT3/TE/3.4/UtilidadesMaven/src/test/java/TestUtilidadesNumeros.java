import com.lavado.gonzalo.UtilidadesNumeros;

public class TestUtilidadesNumeros {
    public static void main(String[] args) {
        System.out.println("**********************");
        System.out.println("¿El nº 12 es par? " + UtilidadesNumeros.esPar(12));
        System.out.println("**********************");
        System.out.println("¿El nº 13 es par? " + UtilidadesNumeros.esPar(13));
        System.out.println("**********************");
        System.out.println("¿El nº 12 es impar? " + UtilidadesNumeros.esImpar(12));
        System.out.println("**********************");
        System.out.println("¿El nº 13 es impar? " + UtilidadesNumeros.esImpar(13));
        System.out.println("**********************");
        System.out.println("¿El nº 15 es primo? " + UtilidadesNumeros.esPrimo(15));
        System.out.println("**********************");
        System.out.println("¿El nº 13 es primo? " + UtilidadesNumeros.esPrimo(13));
        System.out.println("**********************");
        System.out.println("El factorial de 5 es : " + UtilidadesNumeros.factorial(5));
        System.out.println("Los divisores de 10 son:");
        System.out.print('\n');
        for (Integer n : UtilidadesNumeros.devolverDivisores(10)) {
            System.out.print(n + ";\t");
        }
        System.out.print("\b\b");

        System.out.println("**********************");
        System.out.println("¿El nº 5 es perfecto? " + UtilidadesNumeros.esPerfecto(5));
        System.out.println("**********************");
        System.out.println("¿El nº 6 es perfecto? " + UtilidadesNumeros.esPerfecto(6));
    }
}
