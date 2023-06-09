/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Khanban;

/**
 *
 * @author vjohn
 */
<<<<<<< Updated upstream
public class UserAccount {
=======
public class UserAccount //Class to define a user account object
{
>>>>>>> Stashed changes
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    
    // constructor
    public UserAccount(String fn, String ln, String un, String pd) {
        firstName = fn;
        lastName = ln;
        userName = un;
        password = pd;
    }
    
    @Override
    public String toString() {
        return "[" + getFirstName() + ", " + getLastName() 
                + ", " + getUserName() + ", " + getPassword() + "]";
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}


