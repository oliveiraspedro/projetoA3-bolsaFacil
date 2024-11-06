package Services;

import DTOs.UserInstituicaoDTO;
import Entities.UserInstituicao;
import Repositories.InstituicaoRepository;
import Validators.CadastroValidators;
import org.modelmapper.ModelMapper;
import ModelMapper.ModelMapperConfig;

import javax.swing.*;
import java.util.Date;

public class InstituicaoService {

    ModelMapper modelMapper = ModelMapperConfig.getModelMapper();
    private InstituicaoRepository instituicaoRepository = new InstituicaoRepository();

    public UserInstituicao cadastrarInstituicao(UserInstituicaoDTO userInstituicaoDTO) throws Exception{

        // TO DO: Validações e regras de negócio
        // TO DO: Validar Senha

        CadastroValidators validations = new CadastroValidators();

        try {

            if (validations.validateEmail(userInstituicaoDTO.getEmailInstitucional())){

                UserInstituicao userInstituicao = modelMapper.map(userInstituicaoDTO, UserInstituicao.class);

                return instituicaoRepository.saveUserInstituicao(userInstituicao);

            }

        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        return null;
    }
}
