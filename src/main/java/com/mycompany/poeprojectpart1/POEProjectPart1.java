/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poeprojectpart1;

/**
 *
 * @author RC_Student_lab
 */
public class POEProjectPart1 {

    public static void main(String[] args) {
       
        //prompt uesr to signup 
        Register signup = new Register();
        
    }

    private static class Register {
        
             public boolean checkUserName(String username) {
        //prompt user to enter a username
        return username.contains("_") && username.length() == 5;
        
    }
        public boolean checkCellNumber(String cellphone) {
            //prompt user to enter their south african cellphone number
            String cellphonenumber = cellphone.replaceAll("\\s+", "");
        return cellphone.length() == 10 || !cellphone.contains(".*[0-9].*{10}");
    }
        public boolean checkPassword(String password) {
        //prompt user to enter a password
         return password.length() < 8 && 
                 !password.matches(".*[A-Z].*") &&
                 !password.matches(".*[a-z].*") &&
                 !password.matches(".*[0-9].*")&&
                 !password.matches(".*[!@#$%^&*()_+():|<>?=-].*");
    }
        }
    }

