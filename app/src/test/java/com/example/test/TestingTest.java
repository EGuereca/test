package com.example.test;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class TestingTest extends TestCase {
    @Test
    public void testAdd() {
        Testing testing = new Testing();
        assertEquals(3, testing.sum(1, 2));
    }

    @Test
    public void testSub() {
        Testing testing = new Testing();
        assertEquals(1, testing.sub(3, 2));
    }

    @Test
    public void testMul() {
        Testing testing = new Testing();
        assertEquals(6, testing.mul(2, 3));
    }

    @Test
    public void testtMulFail() {
        Testing testing = new Testing();
        assertFalse(8 == testing.mul(2, 3));
    }

    @Test
    public void testDiv() {
        Testing testing = new Testing();
        assertEquals(2, testing.div(6, 3));
    }

    @Test
    public void testMod() {
        Testing testing = new Testing();
        assertEquals(1, testing.mod(5, 2));
    }

    @Test
    public void testPar() {
        Testing testing = new Testing();
        assertTrue(testing.par(64));
    }

    @Test
    public void testImpar() {
        Testing testing = new Testing();
        assertFalse(testing.par(5));
    }

    @Test
    public void testLongi() {
        Testing testing = new Testing();
        assertEquals(10, testing.longi("Hola Mundo"));
    }

    @Test
    public void testPalindromo() {
        Testing testing = new Testing();
        assertTrue(testing.palindromo("reconocer"));
    }

/*
*  assertNotEquals() Compara que dos objetos no sean iguales.
*  assertEquals() Compara que dos objetos sean iguales.
*  assertNull() Compara que un objeto sea nulo.
*  assertNotNull() Compara que un objeto no sea nulo.
*  assertTrue() Compara que una expresión sea verdadera.
*  assertFalse() Compara que una expresión sea falsa.
*  assertArrayEquals() Compara que dos arreglos sean iguales.
* */
}