package Controllers;

import DTOs.AlunoDTO;
import Entities.Aluno;
import Services.AlunoService;

import javax.swing.*;

public class AlunoController {

    AlunoService alunoService = new AlunoService();

    public Aluno cadastrarAluno(AlunoDTO alunoDTO){

        try {
            Aluno aluno = alunoService.cadastrarAluno(alunoDTO);
            return aluno;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o aluno");
            return null;
        }

    }

}