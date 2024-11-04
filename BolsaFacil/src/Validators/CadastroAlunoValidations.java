package Validators;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Pattern;

public class CadastroAlunoValidations {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public LocalDate dataNascimentoValidation(String dataDeNascimentoText){
        LocalDate dataNascimento;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {

            dataNascimento = LocalDate.parse(dataDeNascimentoText, formatter);
            return dataNascimento;

        } catch (DateTimeParseException dateE) {
            JOptionPane.showMessageDialog(null, "Data de nascimento inválida. Use o formato dd/MM/yyyy.");
            return null;
        }
    }

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
