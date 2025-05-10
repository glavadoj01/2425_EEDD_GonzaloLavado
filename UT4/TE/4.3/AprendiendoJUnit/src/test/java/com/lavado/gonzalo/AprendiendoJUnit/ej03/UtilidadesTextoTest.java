package com.lavado.gonzalo.AprendiendoJUnit.ej03;

import org.junit.jupiter.api.Test;

import static com.lavado.gonzalo.AprendiendoJUnit.ej03.UtilidadesTexto.*;
import static org.junit.jupiter.api.Assertions.*;

class UtilidadesTextoTest {

    @Test
    void testEsPalindromo() {
        assertTrue(esPalindromo("Anita lava la tina"));
        assertTrue(esPalindromo("La ruta natural"));
        assertTrue(esPalindromo("Dábale arroz a la zorra el abad"));
        assertFalse(esPalindromo("La casa de la montaña"));
        assertFalse(esPalindromo("El perro de San Roque no tiene rabo"));
    }

    @Test
    void testContarVocales() {
        assertEquals(4, contarVocales("Hola Mundo"));
        assertEquals(5, contarVocales("Murciélago"));
        assertEquals(22, contarVocales("En un lugar de la Mancha de cuyo nombre no quiero acordarme"));
        assertEquals(14, contarVocales("El perro de San Roque no tiene rabo"));
    }

    @Test
    void testContarConsonantes() {
        assertEquals(5, contarConsonantes("Hola Mundo"));
        assertEquals(5, contarConsonantes("Murciélago"));
        assertEquals(26, contarConsonantes("En un lugar de la Mancha de cuyo nombre no quiero acordarme"));
        assertEquals(14, contarConsonantes("El perro de San Roque no tiene rabo"));
    }

    @Test
    void testContarPalabras() {
        assertEquals(2, contarPalabras("Hola Mundo"));
        assertEquals(1, contarPalabras("Murciélago"));
        assertEquals(12, contarPalabras("En un lugar de la Mancha de cuyo nombre no quiero acordarme"));
        assertEquals(8, contarPalabras("El perro de San Roque no tiene rabo"));
        assertEquals(0, contarPalabras(""));
    }

    @Test
    void testContarCaracteres() {
        assertEquals(9, contarCaracteres("Hola Mundo"));
        assertEquals(10, contarCaracteres("Murciélago"));
        assertEquals(48, contarCaracteres("En un lugar de la Mancha de cuyo nombre no quiero acordarme"));
        assertEquals(28, contarCaracteres("El perro de San Roque no tiene rabo"));
        assertEquals(0, contarCaracteres(""));

    }
}