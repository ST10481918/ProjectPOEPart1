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
       
        Register signup = new Register();
        
    }

    private static class Register {
        
             public boolean checkUserName(String username) {
        
        return username.contains("_") && username.length() == 5;
        
    }
        public boolean checkCellNumber(String cellphone) {
            
            String cellphonenumber = cellphone.replaceAll("\\s+", "");
        return cellphone.length() == 10 || !cellphone.contains(".*[0-9].*{10}");
    }
        public boolean checkPassword(String password) {
        
         return password.length() < 8 && 
                 !password.matches(".*[A-Z].*") &&
                 !password.matches(".*[a-z].*") &&
                 !password.matches(".*[0-9].*")&&
                 !password.matches(".*[!@#$%^&*()_+():|<>?=-].*");
    }
        }
    }

