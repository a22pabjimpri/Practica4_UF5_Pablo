/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Exercici2;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Pablo Jiménez
 */
public class LoteriaTest {
    
    public LoteriaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of nou method, of class Loteria.
     */
        @Test
    public void testNou() throws RepetitException {
        Loteria loteria = new Loteria();
        loteria.nou(5);
        loteria.nou(10);
        loteria.nou(15);
        assertTrue(loteria.premiat(5));
        assertTrue(loteria.premiat(10));
        assertTrue(loteria.premiat(15));
        assertFalse(loteria.premiat(20));
    }
    
    

    
    
}
