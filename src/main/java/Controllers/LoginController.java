package Controllers;

import DTOs.AlunoDTO;
import Entities.User;
import Services.LoginService;
import javax.swing.JOptionPane;

public class LoginController {

    LoginService loginService = new LoginService();

    public User login(AlunoDTO alunoDTO){

        try {

            return loginService.login(alunoDTO);

        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro " + e + " no controller ao realizar o login");
            return null;
        }

    }

    public void recuperarSenha(String email){}

}
