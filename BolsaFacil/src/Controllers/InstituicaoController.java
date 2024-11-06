package Controllers;

import DTOs.UserInstituicaoDTO;
import Entities.UserInstituicao;
import Services.InstituicaoService;

import javax.swing.*;

public class InstituicaoController {

    InstituicaoService instituicaoService = new InstituicaoService();

    public UserInstituicao cadastrarInstituicao(UserInstituicaoDTO userInstituicaoDTO){

        try {
            UserInstituicao userInstituicao = instituicaoService.cadastrarInstituicao(userInstituicaoDTO);
            return userInstituicao;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar a instituicao");
            return null;
        }

    }

}
