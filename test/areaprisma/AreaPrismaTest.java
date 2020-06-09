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
public class AreaPrismaTest {
    
    public AreaPrismaTest() {
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
     * Test of isNumeric method, of class AreaPrisma.
     */
    @Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String valor = "e";
        boolean expResult = false;
        boolean result = AreaPrisma.isNumeric(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of leerValor method, of class AreaPrisma.
     */
    @Test
    public void testLeerValor() {
        System.out.println("leerValor");
        float expResult = 5.0F;
        float result = AreaPrisma.leerValor();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of imprimirValor method, of class AreaPrisma.
     */
    @Test
    public void testImprimirValor() {
        System.out.println("imprimirValor");
        String valor = "";
        AreaPrisma.imprimirValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of alturaTriangulo method, of class AreaPrisma.
     */
    @Test
    public void testAlturaTriangulo() {
        System.out.println("alturaTriangulo");
        float baseTriangulo = 0.0F;
        float expResult = 0.0F;
        float result = AreaPrisma.alturaTriangulo(baseTriangulo);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of areaBase method, of class AreaPrisma.
     */
    @Test
    public void testAreaBase() {
        System.out.println("areaBase");
        float baseTriangulo = 0.0F;
        float alturaTriangulo = 0.0F;
        float expResult = 0.0F;
        float result = AreaPrisma.areaBase(baseTriangulo, alturaTriangulo);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of perimetro method, of class AreaPrisma.
     */
    @Test
    public void testPerimetro() {
        System.out.println("perimetro");
        float baseTriangulo = 0.0F;
        float expResult = 0.0F;
        float result = AreaPrisma.perimetro(baseTriangulo);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of areaLateral method, of class AreaPrisma.
     */
    @Test
    public void testAreaLateral() {
        System.out.println("areaLateral");
        float perimetro = 0.0F;
        float alturaPrisma = 0.0F;
        float expResult = 0.0F;
        float result = AreaPrisma.areaLateral(perimetro, alturaPrisma);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of areaTotal method, of class AreaPrisma.
     */
    @Test
    public void testAreaTotal() {
        System.out.println("areaTotal");
        float areaBase = 0.0F;
        float areaLateral = 0.0F;
        float expResult = 0.0F;
        float result = AreaPrisma.areaTotal(areaBase, areaLateral);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class AreaPrisma.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AreaPrisma.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
