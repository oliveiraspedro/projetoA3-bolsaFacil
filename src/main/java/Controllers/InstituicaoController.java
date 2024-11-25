/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import DTOs.BolsaDTO;
import DTOs.InstituicaoDTO;
import DTOs.UserInstituicaoDTO;
import Entities.UserInstituicao;
import Services.InstituicaoService;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class InstituicaoController {
    InstituicaoService instituicaoService = new InstituicaoService();
    
    public UserInstituicao cadastrarInstituicao(UserInstituicaoDTO userInstituicaoDTO, InstituicaoDTO instituicaoDTO){
        try {
            UserInstituicao userInstituicao = instituicaoService.cadastrarInstituicao(userInstituicaoDTO, instituicaoDTO);
            return userInstituicao;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar ao cadastrar a instituição!");
            return null;
        }
    }
    
    public boolean addBolsas(BolsaDTO bolsaDTO){
        try {
            return instituicaoService.addBolsas(bolsaDTO);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar ao cadastrar a bolsa!");
            return false;
        }
    }
}
