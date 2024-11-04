package Services;

import DTOs.AlunoDTO;
import Entities.Aluno;
import Repositories.LoginRepository;

import java.util.Objects;

public class LoginService {

    LoginRepository loginRepository = new LoginRepository();

    public String login(AlunoDTO alunoDTO){

        // TO DO: Validações e regras de negócio
        // As validações deveram retornar uma String especificando o que deu errado

        Aluno aluno = loginRepository.findByEmail(alunoDTO.getEmail());

        if (Objects.equals(aluno.getEmail(), "admin@gmail.com") && aluno.getSenha().equals(alunoDTO.getSenha())){
            return "Admin logado com sucesso";
        } else {
            if (aluno != null && aluno.getSenha().equals(alunoDTO.getSenha())){
                return "Aluno logado com sucesso!";
            }
        }

        return "Erro ao realizar o login";
    }

    public void recuperarSenha(String email){

        Aluno aluno = loginRepository.findByEmail(email);

        if (aluno != null){
            // TO DO: Chamar o email verification para enviar um email de confirmação ao aluno
            //        Ele retornará se o emial foi verificado ou não (true or false)
            //        Caso true, chamará o repository.findByEmail e retornará .getSenha
            //        Será chamado o emailSend para enviar um email com a senha do usuário
            //        E o metodo recuperar senha irá retornar um String informando que um email foi enviado para o usuário
        }

    }

}
