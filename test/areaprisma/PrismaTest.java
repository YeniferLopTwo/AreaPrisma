/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaprisma;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author YENIFER LOPEZ
 */
public class PrismaTest {
    
    public PrismaTest() {
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
     * Test of getBaseTriangulo method, of class Prisma.
     */
    @Test
    public void testGetBaseTriangulo() {
        System.out.println("getBaseTriangulo");
        Prisma instance = null;
        int expResult = 0;
        int result = instance.getBaseTriangulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAlturaPrisma method, of class Prisma.
     */
    @Test
    public void testGetAlturaPrisma() {
        System.out.println("getAlturaPrisma");
        Prisma instance = null;
        int expResult = 0;
        int result = instance.getAlturaPrisma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAlturaPrisma method, of class Prisma.
     */
    @Test
    public void testSetAlturaPrisma() {
        System.out.println("setAlturaPrisma");
        int altura = 0;
        Prisma instance = null;
        instance.setAlturaPrisma(altura);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBaseTriangulo method, of class Prisma.
     */
    @Test
    public void testSetBaseTriangulo() {
        System.out.println("setBaseTriangulo");
        int base = 0;
        Prisma instance = null;
        instance.setBaseTriangulo(base);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of alturaTriangulo method, of class Prisma.
     */
    @Test
    public void testAlturaTriangulo() {
        System.out.println("alturaTriangulo");
        Prisma instance = null;
        float expResult = 0.0F;
        float result = instance.alturaTriangulo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of areaBase method, of class Prisma.
     */
    @Test
    public void testAreaBase() {
        System.out.println("areaBase");
        Prisma instance = null;
        float expResult = 0.0F;
        float result = instance.areaBase();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of perimetro method, of class Prisma.
     */
    @Test
    public void testPerimetro() {
        System.out.println("perimetro");
        Prisma instance = null;
        float expResult = 0.0F;
        float result = instance.perimetro();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of areaLateral method, of class Prisma.
     */
    @Test
    public void testAreaLateral() {
        System.out.println("areaLateral");
        Prisma instance = null;
        float expResult = 0.0F;
        float result = instance.areaLateral();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of areaTotal method, of class Prisma.
     */
    @Test
    public void testAreaTotal() {
        System.out.println("areaTotal");
        Prisma instance = null;
        float expResult = 0.0F;
        float result = instance.areaTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
