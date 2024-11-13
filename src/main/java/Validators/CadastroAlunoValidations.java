package Validators;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.regex.Pattern;

public class CadastroAlunoValidations {

    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat(DATE_FORMAT);
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public Date dataNascimentoValidation(String dataDeNascimentoText){

        DATE_FORMATTER.setLenient(false); // Desabilita conversão leniente para validar a data estritamente
        try {
            // Tenta converter o texto para Date
            return DATE_FORMATTER.parse(dataDeNascimentoText);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Data de nascimento inválida. Use o formato dd/MM/yyyy.");
            return null; // Retorna null caso a data seja inválida
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
