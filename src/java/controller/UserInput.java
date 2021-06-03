/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author admin
 */
public class UserInput {
    private String displayName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean result;
    
    // get user displayname
    public String getDisplayName(){
        return displayName;
    }
    
    // set user displayname
    public void setDisplayName(String dName){
        displayName = dName;
    }
    
    // get user displayname
    public String getFirstName(){
        return displayName;
    }
    
    // set user displayname
    public void setFirstName(String dName){
        displayName = dName;
    }
    
    // get user displayname
    public String getLastName(){
        return displayName;
    }
    
    // set user displayname
    public void setLastName(String dName){
        displayName = dName;
    }
    
    // get user displayname
    public String getEmail(){
        return displayName;
    }
    
    // set user displayname
    public void setEmail(String dName){
        displayName = dName;
    }
    
    // get user  password
    public String getPassword(){
        return password;
    }
    
    // get validation result
    public boolean getResult(){
        return result;
    }
    
    // set validation result
    public void setResult(boolean validationResult){
        result = validationResult;
    }
}
