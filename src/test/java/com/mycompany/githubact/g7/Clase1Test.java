/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.githubact.g7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Laura
 */
public class Clase1Test {
    
    public Clase1Test() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
            
    /**
     * Test of sumar method, of class Clase1.
     */
    @org.junit.jupiter.api.Test
    public void testSumar() {
        System.out.println("sumar");
        Clase1 instance = new Clase1();
        int result = instance.sumar(5, 4);
        assertEquals(9, result);
        
    }
    
    @org.junit.jupiter.api.Test
    public void testSumar2() {
        System.out.println("sumar");
        Clase1 instance = new Clase1();
        int result = instance.sumar(10, 50);
        assertEquals(60, result);
        
    } 
    
    public void testSumar3() {
        System.out.println("sumar");
        Clase1 instance = new Clase1();
        int result = instance.sumar(50, 50);
        assertEquals(100, result);
}
}
