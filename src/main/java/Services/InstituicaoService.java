/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DTOs.BolsaDTO;
import DTOs.InstituicaoDTO;
import DTOs.UserInstituicaoDTO;
import Entities.Bolsas;
import Entities.Instituicao;
import Entities.UserInstituicao;
import Repositories.InstituicaoRepository;
import Validators.CadastroInsitituicaoValidations;
import Validators.GeneralValidations;
import ModelMapper.ModelMapperConfig;
import javax.swing.JOptionPane;
import org.modelmapper.ModelMapper;

/**
 *
 * @author Pedro
 */
public class InstituicaoService {
    
    private ModelMapper modelMapper = ModelMapperConfig.getModelMapper();
    InstituicaoRepository instituicaoRepository = new InstituicaoRepository();
    
    public UserInstituicao cadastrarInstituicao(UserInstituicaoDTO userInstituicaoDTO, InstituicaoDTO instituicaoDTO){
        // TO DO: Validações e regras de negócio
        // TO DO: Validar Email, Senha

        CadastroInsitituicaoValidations cadastroValidations = new CadastroInsitituicaoValidations();
        GeneralValidations generalValidations = new GeneralValidations();

        try {
            if (generalValidations.validateEmail(userInstituicaoDTO.getEmailInstitucional())){
                UserInstituicao userInstituicao = modelMapper.map(userInstituicaoDTO, UserInstituicao.class);
                Instituicao instituicao = modelMapper.map(instituicaoDTO, Instituicao.class);

                return instituicaoRepository.save(userInstituicao, instituicao); 
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e + " : Erro no Service");
        }

        return null;
    }
    
    public boolean addBolsas(BolsaDTO bolsaDTO){
        Bolsas bolsa = modelMapper.map(bolsaDTO, Bolsas.class);
        return instituicaoRepository.addBolsas(bolsa);
    }
    
}
