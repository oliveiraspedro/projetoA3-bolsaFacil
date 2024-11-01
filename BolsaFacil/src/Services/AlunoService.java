package Services;

import DTOs.AlunoDTO;
import Entities.Aluno;
import Repositories.AlunoRepository;
import org.modelmapper.ModelMapper;

public class AlunoService {

    private ModelMapper modelMapper = new ModelMapper();
    private AlunoRepository alunoRepository = new AlunoRepository();

    public Aluno cadastrarAluno(AlunoDTO alunoDTO) throws Exception{

        // TO DO: Validações e regras de negócio
        // TO DO: Validar Email, Senha

        Aluno aluno = modelMapper.map(alunoDTO, Aluno.class);

        return alunoRepository.save(aluno);

    }
}
