/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validators;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class GeneralValidations {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
    
    public boolean validateEmail(String email) {
        if (email == null || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o email!");
            return false; // Email não pode ser nulo ou vazio
        }
        if (EMAIL_PATTERN.matcher(email).matches()){
            return true;
        }

        JOptionPane.showMessageDialog(null, "Formato do email incorreto");
        return false;
    }
}
