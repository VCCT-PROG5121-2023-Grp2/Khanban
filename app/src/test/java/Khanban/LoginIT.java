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

    @Test
    public void testCheckUserName()
    {
        String un = "kyle!!!!!!!";
        boolean expResult = false;
        boolean result = Login.checkUserName(un);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckPasswordComplexity()
    {
        String pd = "Ch&&sec@ke99!";
        boolean expResult = true;
        boolean result = Login.checkPasswordComplexity(pd);
        assertEquals(expResult, result);
    }

    @Test
    public void testLoginUser()
    {
        String un = "kyl_1";
        String pd = "Ch&&sec@ke99!";
        var instance = new Login();
        boolean expResult = true;
        boolean result = instance.loginUser(un, pd);
        assertEquals(expResult, result);
    }

}
