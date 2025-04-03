package com.lavado.gonzalo;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char op;
        int num;
        String texto;

        bucle:
        while (true) {
            op = menu();
            switch (op) {
                case '1':
                    System.out.print("Ingrese un número: ");
                    try {
                        num = sc.nextInt();
                        sc.nextLine();
                        AnalizadorNumerico.analizaNumerico(num);
                    } catch (Exception e) {
                        System.out.println("\nError: Ingresar un número entero\n");
                    }
                    break;
                case '2':
                    System.out.print("Ingrese una cadena de texto (Sin comillas): ");
                    texto = sc.nextLine();
                    AnalizadorTexto.analizadorTexto(texto);
                    break;
                default:
                    System.out.println("¡Gracias por usar el Analizador de Datos! Hasta pronto.");
                    break bucle;
            }
        }
        sc.close();
    }

    public static char menu() {
        char op;

        while (true) {
            System.out.print("""
                    
                    Seleccione una opción:
                    - 1 - Análisis Numérico
                    - 2 - Análisis de Texto
                    - 3 - Salir
                    
                    Opción:\s""");
            try {
                op = sc.nextLine().charAt(0);
                if (op >= '1' && op <= '3') {
                    return op;
                }
                System.out.println("\nError - Ingresar una opción valida\n");

            } catch (IndexOutOfBoundsException e) {
                System.out.println("\nError - Ingresar una opción\n");
            }
        }
    }
}
