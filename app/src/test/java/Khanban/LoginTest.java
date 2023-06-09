package Khanban;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class LoginTest
{
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