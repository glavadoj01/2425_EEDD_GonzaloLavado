package com.lavado.gonzalo.AprendiendoJUnit.ej02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.lavado.gonzalo.AprendiendoJUnit.ej02.UtilidadesNumeros.*;
import static org.junit.jupiter.api.Assertions.*;

class UtilidadesNumerosTest {

// Sin importación estática de la clase
    @Test
    void testEsPar() {
        assertTrue(UtilidadesNumeros.esPar(0));
        assertFalse(UtilidadesNumeros.esPar(1));
        assertTrue(UtilidadesNumeros.esPar(2));
        assertFalse(UtilidadesNumeros.esPar(5));
    }

    @Test
    void testEsImpar() {
        assertFalse(UtilidadesNumeros.esImpar(0));
        assertTrue(UtilidadesNumeros.esImpar(5));
        assertFalse(UtilidadesNumeros.esImpar(6));
        assertTrue(UtilidadesNumeros.esImpar(7));
    }
// A partir de aquí, con importación estática
    @Test
    void testEsPrimo() {
        assertFalse(esPrimo(0));
        assertFalse(esPrimo(1));
        assertTrue(esPrimo(2));
        assertTrue(esPrimo(3));
        assertFalse(esPrimo(4));
        assertTrue(esPrimo(5));
    }

    @Test
    void testFactorial() {
        assertEquals(1,factorial(0));
        assertEquals(1,factorial(1));
        assertEquals(2,factorial(2));
        assertEquals(6,factorial(3));
        assertEquals(120,factorial(5));
        assertEquals(3628800,factorial(10));
        assertThrows(IllegalArgumentException.class,
                     () -> factorial(-1));
    }

    @Test
    void testDevolverDivisores() {
        assertArrayEquals(List.of().toArray(), devolverDivisores(0).toArray());
        assertArrayEquals(List.of(1).toArray(), devolverDivisores(1).toArray());
        assertArrayEquals(List.of(1,2).toArray(),devolverDivisores(2).toArray());
        assertArrayEquals(List.of(1,3).toArray(), devolverDivisores(3).toArray());
        assertArrayEquals(List.of(1,2,4).toArray(), devolverDivisores(4).toArray());
        assertArrayEquals(List.of(1,5).toArray(), devolverDivisores(5).toArray());

    }

    @Test
    void testEsPerfecto() {
        assertFalse(esPerfecto(0));
        assertFalse(esPerfecto(5));
        assertTrue(esPerfecto(6));
        assertFalse(esPerfecto(9));
        assertFalse(esPerfecto(10));
        assertTrue(esPerfecto(28));
        assertTrue(esPerfecto(496));
    }
}