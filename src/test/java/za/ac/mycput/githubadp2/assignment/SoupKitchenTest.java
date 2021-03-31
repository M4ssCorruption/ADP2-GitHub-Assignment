/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.githubadp2.assignment;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author BLANCO
 */
public class SoupKitchenTest {

    private SoupKitchen distruction;
    private SoupKitchen corrupt;
    private SoupKitchen kit;

    public SoupKitchenTest() {
    }

    @Before
    public void setUp() {
        kit = new SoupKitchen();
        corrupt = new SoupKitchen();
        distruction = new SoupKitchen();
        distruction = kit;
    }

    @Test
    public void kitchenEquality() {
        assertEquals(kit, distruction);

    }

    @Test
    public void kiitchenIdentity() {
        assertSame(kit, distruction);
    }

    @Test
    public void corruptFail() {
        fail();
    }

    @Test(timeout = 30)
    public void timeTest() {
        int nDisks = 3;

        int topN=0;
        char from=2;
        char inter;
        char to=7;
        if (topN == 1) {
            System.out.println("Disk 1 from " + from + " to " + to);
        } else {

            System.out.println("Disk " + topN + " from " + from + " to " + to);

        }

    }

    @Disabled("don't run in enviroment when its low")
    @Test
    public void testDisable() {
        System.out.println("Disable the method");
    }

    /**
     * Test of getKitchen method, of class SoupKitchen.
     */
    @Test
    public void testGetKitchen() {
        System.out.println("getKitchen");
        SoupKitchen instance = new SoupKitchen();
        String expResult = "";
        String result = instance.getKitchen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKitchen method, of class SoupKitchen.
     */
    @Test
    public void testSetKitchen() {
        System.out.println("setKitchen");
        String kitchen = "";
        SoupKitchen instance = new SoupKitchen();
        instance.setKitchen(kitchen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSoup method, of class SoupKitchen.
     */
    @Test
    public void testGetSoup() {
        System.out.println("getSoup");
        SoupKitchen instance = new SoupKitchen();
        String expResult = "";
        String result = instance.getSoup();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSoup method, of class SoupKitchen.
     */
    @Test
    public void testSetSoup() {
        System.out.println("setSoup");
        String soup = "";
        SoupKitchen instance = new SoupKitchen();
        instance.setSoup(soup);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCorruption method, of class SoupKitchen.
     */
    @Test
    public void testGetCorruption() {
        System.out.println("getCorruption");
        SoupKitchen instance = new SoupKitchen();
        String expResult = "";
        String result = instance.getCorruption();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCorruption method, of class SoupKitchen.
     */
    @Test
    public void testSetCorruption() {
        System.out.println("setCorruption");
        String corruption = "";
        SoupKitchen instance = new SoupKitchen();
        instance.setCorruption(corruption);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistraction method, of class SoupKitchen.
     */
    @Test
    public void testGetDistraction() {
        System.out.println("getDistraction");
        SoupKitchen instance = new SoupKitchen();
        double expResult = 0.0;
        double result = instance.getDistraction();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDistraction method, of class SoupKitchen.
     */
    @Test
    public void testSetDistraction() {
        System.out.println("setDistraction");
        double distraction = 0.0;
        SoupKitchen instance = new SoupKitchen();
        instance.setDistraction(distraction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SoupKitchen.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SoupKitchen instance = new SoupKitchen();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
