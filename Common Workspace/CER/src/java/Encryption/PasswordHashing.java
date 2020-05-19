/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Lucas.L.H.H
 */
public class PasswordHashing {
    
    // Assigning SALT value for salting user entered password value
    public static final String SALT = "SOFT255SL - CERWebApp";
    
    /* PROCESS OF GENERATING SHA1 HASH VALUE OF PASSWORD */
    public static String generateHashValue(String passwordValue) {
        StringBuilder hashValue = new StringBuilder();

        try {
            MessageDigest sha = MessageDigest.getInstance("SHA-1");
            byte[] hashedValueBytes = sha.digest(passwordValue.getBytes());
            char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f'};
            for (int x = 0; x < hashedValueBytes.length; ++x) {
                byte b = hashedValueBytes[x];
                hashValue.append(digits[(b & 0xf0) >> 4]);
                hashValue.append(digits[b & 0x0f]);
            }
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("ERROR: " + ex);
        }
        return hashValue.toString();
    }

}
