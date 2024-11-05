package Services;

import DTOs.AlunoDTO;
import Entities.Aluno;
import Repositories.AlunoRepository;
import Validators.CadastroAlunoValidations;
import org.modelmapper.ModelMapper;
import ModelMapper.ModelMapperConfig;

import javax.swing.*;
import java.util.Date;

public class AlunoService {

    ModelMapper modelMapper = ModelMapperConfig.getModelMapper();
    private AlunoRepository alunoRepository = new AlunoRepository();

    public Aluno cadastrarAluno(AlunoDTO alunoDTO) throws Exception{

        // TO DO: Validações e regras de negócio
        // TO DO: Validar Email, Senha

        CadastroAlunoValidations validations = new CadastroAlunoValidations();
        Date dataDeNascimento = validations.dataNascimentoValidation(alunoDTO.getData_nascimento());

        try {
            if (dataDeNascimento != null && validations.validateEmail(alunoDTO.getEmail())){
                Aluno aluno = modelMapper.map(alunoDTO, Aluno.class);

                return alunoRepository.save(aluno);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        return null;
    }
}
