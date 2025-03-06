package com.softmar.nexus;

import com.softmar.nexus.modulo1.Saludo;
import com.softmar.nexus.modulo2.Operacion;

public class Main {
    public static void main(String[] args) {
        Saludo saludo = new Saludo();
        Operacion operacion = new Operacion();

        System.out.println(saludo.obtenerSaludo());
        System.out.println("Resultado de la suma: " + operacion.sumar(5, 3));
    }
}