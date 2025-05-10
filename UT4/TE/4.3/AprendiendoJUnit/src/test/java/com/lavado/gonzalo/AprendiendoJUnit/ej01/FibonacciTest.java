package com.lavado.gonzalo.AprendiendoJUnit.ej01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FibonacciTest {
// https://www.calculatorsoup.com/calculators/discretemathematics/fibonacci-calculator.php
    private Fibonacci objetoPruebas;

    @BeforeEach
    void setUp() {
        objetoPruebas = new Fibonacci();
    }

    @AfterEach
    void tearDown() {
        objetoPruebas = null;
    }

    @Test
    @DisplayName("testFib0")
    void testFib0() {
        assertEquals(0, objetoPruebas.fib(0));
    }
    @Test
    @DisplayName("testFib1")
    void testFib1() {
        assertEquals(1, objetoPruebas.fib(1));
    }
    @Test
    @DisplayName("testFib2")
    void testFib2() {
        assertEquals(1, objetoPruebas.fib(2));
    }
    @Test
    @DisplayName("testFib3")
    void testFib3() {
        assertEquals(2, objetoPruebas.fib(3));
    }
    @Test
    @DisplayName("testFib4")
    void testFib4() {
        assertEquals(3, objetoPruebas.fib(4));
    }
    @Test
    @DisplayName("testFib5")
    void testFib5() {
        assertEquals(5, objetoPruebas.fib(5));
    }
    @Test
    @DisplayName("testFib8")
    void testFib8() {
        assertEquals(21, objetoPruebas.fib(8));
    }
    @Test
    @DisplayName("testFib10")
    void testFib10() {
        assertEquals(55, objetoPruebas.fib(10));
    }
    @Test
    @DisplayName("testFib13")
    void testFib13() {
        assertEquals(233, objetoPruebas.fib(13));
    }
    @Test
    @DisplayName("testFib15")
    void testFib15() {
        assertEquals(610, objetoPruebas.fib(15));
    }
    @Test
    @DisplayName("testFib20")
    void testFib20() {
        assertEquals(6765, objetoPruebas.fib(20));
    }
    @Test
    @DisplayName("testFib25")
    void testFib25() {
        assertEquals(75025, objetoPruebas.fib(25));
    }
    @Test
    @DisplayName("Lanzar excepción si el número es negativo")
    void testNegativeNumber() {
        assertThrows(IllegalArgumentException.class,
                     () -> objetoPruebas.fib(-1)
                    );
    }
}