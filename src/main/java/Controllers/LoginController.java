package Controllers;

import DTOs.AlunoDTO;
import Services.LoginService;

public class LoginController {

    LoginService loginService = new LoginService();

    public String login(AlunoDTO alunoDTO){

        try {

            return loginService.login(alunoDTO);

        } catch (Exception e){
            return e + "Erro ao realizar o login";
        }

    }

    public void recuperarSenha(String email){}

}
