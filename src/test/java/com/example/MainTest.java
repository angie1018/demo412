package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    
    private Main main;
    
    @BeforeEach
    public void setUp() {
        main = new Main();
    }
    
    @Test
    public void testSuma() {
        assertEquals(5, main.suma(2, 3));
        assertEquals(0, main.suma(-5, 5));
        assertEquals(-10, main.suma(-5, -5));
    }
    
    @Test
    public void testResta() {
        assertEquals(1, main.resta(5, 4));
        assertEquals(0, main.resta(5, 5));
        assertEquals(-10, main.resta(-5, 5));
    }
    
    @Test
    public void testMultiplicacion() {
        assertEquals(6, main.multiplicacion(2, 3));
        assertEquals(0, main.multiplicacion(0, 100));
        assertEquals(25, main.multiplicacion(5, 5));
    }
    
    @Test
    public void testDivision() {
        assertEquals(2.0, main.division(6, 3));
        assertEquals(0.5, main.division(1, 2));
        assertEquals(1.0, main.division(5, 5));
    }
    
    @Test
    public void testDivisionPorCero() {
        assertThrows(IllegalArgumentException.class, () -> {
            main.division(10, 0);
        });
    }
}
