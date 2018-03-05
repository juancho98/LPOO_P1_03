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
public class StudentIDArrayTest {
    
    public StudentIDArrayTest() {
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
     * Test of setProm method, of class StudentIDArray.
     */
    @Test
    public void testSetProm() {
        System.out.println("setProm");
        double prom = 0.0;
        StudentIDArray instance = null;
        instance.setProm(prom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class StudentIDArray.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        StudentIDArray instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class StudentIDArray.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        StudentIDArray instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProm method, of class StudentIDArray.
     */
    @Test
    public void testGetProm() {
        System.out.println("getProm");
        StudentIDArray instance = null;
        double expResult = 0.0;
        double result = instance.getProm();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class StudentIDArray.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        StudentIDArray instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class StudentIDArray.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        StudentIDArray instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class StudentIDArray.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StudentIDArray.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
