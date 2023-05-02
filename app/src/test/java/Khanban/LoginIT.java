/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Khanban;

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
public class LoginIT
{
    
    public LoginIT()
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
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName()
    {
        System.out.println("checkUserName");
        String un = "";
        boolean expResult = false;
        boolean result = Login.checkUserName(un);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity()
    {
        System.out.println("checkPasswordComplexity");
        String pd = "";
        boolean expResult = false;
        boolean result = Login.checkPasswordComplexity(pd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser()
    {
        System.out.println("registerUser");
        UserAccount u = null;
        String expResult = "";
        String result = Login.registerUser(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser()
    {
        System.out.println("loginUser");
        String un = "";
        String pd = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser(un, pd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus()
    {
        System.out.println("returnLoginStatus");
        UserAccount u = null;
        Login instance = new Login();
        String expResult = "";
        String result = instance.returnLoginStatus(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUser method, of class Login.
     */
    @Test
    public void testFindUser()
    {
        System.out.println("findUser");
        String un = "";
        Login instance = new Login();
        UserAccount expResult = null;
        UserAccount result = instance.findUser(un);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
