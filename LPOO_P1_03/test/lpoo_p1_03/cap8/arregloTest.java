/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo_p1_03.cap8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jdani
 */
public class arregloTest {
    
    public arregloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addLista method, of class arreglo.
     */
    @Test
    public void testAddLista() {
        System.out.println("addLista");
        arreglo instance = new arreglo();
        instance.addLista();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLista method, of class arreglo.
     */
    @Test
    public void testSetLista() {
        System.out.println("setLista");
        String nombre = "";
        String numero = "";
        Integer i = null;
        arreglo instance = new arreglo();
        instance.setLista(nombre, numero, i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class arreglo.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        arreglo instance = new arreglo();
        instance.buscar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
