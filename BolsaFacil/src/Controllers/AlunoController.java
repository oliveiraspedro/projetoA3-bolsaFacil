package Controllers;

import DTOs.AlunoDTO;
import Entities.Aluno;
import Services.AlunoService;

public class AlunoController {

    AlunoService alunoService = new AlunoService();

    public String cadastrarAluno(AlunoDTO alunoDTO){

        try {
            Aluno aluno = alunoService.cadastrarAluno(alunoDTO);
            return "AlunoEmail: " + aluno.getEmail() + "\n" +
                    "AlunoNome: " + aluno.getNomeAluno() + "\n" +
                    "AlunoSenha: " + aluno.getSenha();
        }catch (Exception e){
            return "Erro ao cadastrar o aluno";
        }

    }

}