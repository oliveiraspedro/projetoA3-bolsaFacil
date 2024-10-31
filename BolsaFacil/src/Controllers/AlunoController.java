package Controllers;

import DTOs.AlunoDTO;
import Entities.Aluno;
import Services.AlunoService;

public class AlunoController {

    AlunoService alunoService = new AlunoService();

    public String cadastrarAluno(AlunoDTO alunoDTO){

        try {
            Aluno aluno = alunoService.cadastrarAluno(alunoDTO);
            return "AlunoId: " + aluno.getId() + "\n" +
                    "AlunoEmail: " + aluno.getEmail() + "\n" +
                    "AlunoNome: " + aluno.getNomeAluno() + "\n" +
                    "AlunoSenha: " + aluno.getSenha();
        }catch (Exception e){
            return "Erro ao cadastrar o aluno";
        }

    }

    public String login(AlunoDTO alunoDTO){

        try {

            return alunoService.login(alunoDTO);

        } catch (Exception e){
            return "Erro ao realizar o login";
        }

    }

    public void recuperarSenha(String email){}

}