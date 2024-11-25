/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Pedro
 */
public class PasswordUtils {
    
    public static String hashPassword(String plainPassword){
        // Gera o hash com 12 rounds (valor padrão recomendado)
        return BCrypt.hashpw("bolsafacil011", BCrypt.gensalt());
    }
    
    public static boolean checkPassword(String plainPassword, String hashedPassword) {
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }
}
