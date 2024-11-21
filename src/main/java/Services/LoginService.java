package Services;

import DTOs.AlunoDTO;
import Entities.Aluno;
import Enums.UserTypes;
import Repositories.LoginRepository;

import java.util.Objects;
import javax.swing.JOptionPane;

public class LoginService {

    LoginRepository loginRepository = new LoginRepository();

    public UserTypes login(AlunoDTO alunoDTO){

        // TO DO: Validações e regras de negócio

        UserTypes userType = loginRepository.findByEmail(alunoDTO.getEmail(), alunoDTO.getSenha());
        
        if (userType != null) {
            return userType;
        }
        
        JOptionPane.showMessageDialog(null, "O usuário não cadastrado ou senha incorreta!");
        return null;
        
    }

    public void recuperarSenha(String email){

//        Aluno aluno = loginRepository.findByEmail(email);
        
//        if (aluno != null){;
            // TO DO: Chamar o email verification para enviar um email de confirmação ao aluno
            //        Ele retornará se o emial foi verificado ou não (true or false)
            //        Caso true, chamará o repository.findByEmail e retornará .getSenha
            //        Será chamado o emailSend para enviar um email com a senha do usuário
            //        E o metodo recuperar senha irá retornar um String informando que um email foi enviado para o usuário
    }

}
