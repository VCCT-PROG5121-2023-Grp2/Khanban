/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Khanban;

import java.util.Scanner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vjohn
 */
public class AppTest
{
    
    public AppTest()
    {
    }
    
    @BeforeAll
    public static void setUpClass()
    {
    }
    
    @AfterAll
    public static void tearDownClass()
    {
    }
    
    @BeforeEach
    public void setUp()
    {
    }
    
    @AfterEach
    public void tearDown()
    {
    }

    /**
     * Test of main method, of class App.
     */
    @Test
    public void testMain()
    {
        System.out.println("main");
        String[] args = null;
        App.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dispatchLoop method, of class App.
     */
    @Test
    public void testDispatchLoop()
    {
        System.out.println("dispatchLoop");
        App.dispatchLoop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createUserAccount method, of class App.
     */
    @Test
    public void testCreateUserAccount()
    {
        System.out.println("createUserAccount");
        Scanner input = null;
        UserAccount expResult = null;
        UserAccount result = App.createUserAccount(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class App.
     */
    @Test
    public void testLoginUser()
    {
        System.out.println("loginUser");
        Scanner input = null;
        Login controller = null;
        UserAccount expResult = null;
        UserAccount result = App.loginUser(input, controller);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAChoice method, of class App.
     */
    @Test
    public void testGetAChoice()
    {
        System.out.println("getAChoice");
        Scanner input = null;
        String expResult = "";
        String result = App.getAChoice(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class App.
     */
    @Test
    public void testDisplay()
    {
        System.out.println("display");
        UserAccount u = null;
        App.display(u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menu method, of class App.
     */
    @Test
    public void testMenu()
    {
        System.out.println("menu");
        App.menu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
