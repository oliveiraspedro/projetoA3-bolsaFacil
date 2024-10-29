package Controllers;

import DTOs.AlunoDTO;
import Entities.Aluno;
import Services.AlunoService;

public class AlunoController {

    AlunoService alunoService = new AlunoService();

    public String cadastrarAluno(AlunoDTO alunoDTO){

        try {
            Aluno aluno = alunoService.criarAluno(alunoDTO);
            return "AlunoId: " + aluno.getId() + "\n" +
                    "AlunoEmail: " + aluno.getEmail() + "\n" +
                    "AlunoNome: " + aluno.getNomeAluno() + "\n" +
                    "AlunoSenha: " + aluno.getSenha();
        }catch (Exception e){
            return "Erro ao cadastrar o aluno";
        }

    }

}
