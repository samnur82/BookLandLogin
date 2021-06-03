/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/**
 *
 * @author admin
 */
public class ValidateUserInput {
    
    public void sanitizeInput(UserInput userData){
        String username = userData.getDisplayName();
        String firstName = userData.getFirstName();
        String lastName = userData.getLastName();
        String email = userData.getEmail();
        String password = userData.getPassword();
        boolean regPattern;
        
        // do sanitazion
        String regex = "^[\\w\\-]*$";
        
        regPattern = Pattern.matches(regex, username);
        userData.setResult(regPattern);
    }
}
