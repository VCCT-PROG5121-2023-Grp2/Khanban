/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Khanban;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author vjohn
 */
public class Login
{

    ArrayList<UserAccount> userArr = new ArrayList<>();

    Login()
    {
        try
        {
            String cwd = Path.of("").toAbsolutePath().toString(); //Gets current absolute directory https://stackoverflow.com/a/51028045
            Scanner scanLine = new Scanner(new File(cwd + "\\Users.txt"));
            while (scanLine.hasNextLine())
            {
                String line = scanLine.nextLine();
                Scanner scanE = new Scanner(line).useDelimiter(",");
                userArr.add(new UserAccount(scanE.next(), scanE.next(), scanE.next(), scanE.next()));
                scanE.close();
            }
            scanLine.close();
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean checkUserName(String un)
    {
        return un.contains("_") && un.length() <= 5;
    }

    public static boolean checkPasswordComplexity(String pd)
    {
        boolean capitalFlag = false;
        boolean digitFlag = false;
        boolean specialFlag = false;

        for (char c : pd.toCharArray())
        {
            if (Character.isUpperCase(c))
            {
                capitalFlag = true;
            }
            if (Character.isDigit(c))
            {
                digitFlag = true;
            }
            if (!Character.isDigit(c) && !Character.isLetter(c) && !Character.isWhitespace(c))
            {
                specialFlag = true;
            }
        }
        return capitalFlag && digitFlag && specialFlag && pd.length() >= 8;
    }

    public static String registerUser(UserAccount u)
    {
        try
        {
            FileWriter writeUser = new FileWriter("Users.txt");
            String message = "";

            if (Login.checkPasswordComplexity(u.getPassword()) && Login.checkUserName(u.getUserName()))
            {
                message = "Username and password is valid, user is registered.";
                writeUser.write(u.getFirstName() + "," + u.getLastName() + "," + u.getUserName() + "," + u.getPassword() + "\n");
                writeUser.close();
            } else
            {
                if (!Login.checkUserName(u.getUserName()))
                {
                    message = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length .";
                } else
                {
                    message = "Username succesfully captured";
                }
                if (!Login.checkPasswordComplexity(u.getPassword()))
                {
                    message += "\nPassword is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
                } else
                {
                    message += "\nPassword succesfully captured";
                }
            }
            return message;
        } catch (IOException ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            return "Error";
        }
    }

    public boolean loginUser(String un, String pd)
    {
        boolean foundFlag = false;
        for (UserAccount u : userArr)
        {

            if (un.equals(u.getUserName()) && pd.equals(u.getPassword()) && !foundFlag)
            {
                foundFlag = true;
                break;
            }
        }

        return foundFlag;
    }

    public UserAccount findUser(String un)
    {
        UserAccount user = new UserAccount("", "", "", "");
        for (UserAccount u : userArr)
        {
            if (un.equalsIgnoreCase(u.getUserName()))
            {
                user = u;
            }
        }
        return user;
    }
}

