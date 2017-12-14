 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct11_2017_inheritance;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class ElectronicShopTest {
    
    public ElectronicShopTest() {
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
     * Test of addDevices method, of class ElectronicShop.
     */
    @Test
    public void testAddDevices() {
        System.out.println("addDevices");
        Device d = null;
        ElectronicShop instance = new ElectronicShop();
        instance.addDevices(d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeDevices method, of class ElectronicShop.
     */
    @Test
    public void testRemoveDevices() {
        System.out.println("removeDevices");
        Device d = null;
        ElectronicShop instance = new ElectronicShop();
        instance.removeDevices(d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showWholeList method, of class ElectronicShop.
     */
    @Test
    public void testShowWholeList() {
        System.out.println("showWholeList");
        ElectronicShop instance = new ElectronicShop();
        instance.showWholeList();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showListId method, of class ElectronicShop.
     */
    @Test
    public void testShowListId() {
        System.out.println("showListId");
        int id = 0;
        ElectronicShop instance = new ElectronicShop();
        instance.showListId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showGroup method, of class ElectronicShop.
     */
    @Test
    public void testShowGroup() {
        System.out.println("showGroup");
        String str = "";
        ElectronicShop instance = new ElectronicShop();
        instance.showGroup(str);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showListOffers method, of class ElectronicShop.
     */
    @Test
    public void testShowListOffers() {
        System.out.println("showListOffers");
        ElectronicShop instance = new ElectronicShop();
        instance.showListOffers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
