package Services;

import DTOs.AlunoDTO;
import Entities.Aluno;
import Repositories.AlunoRepository;
import org.modelmapper.ModelMapper;

public class AlunoService {

    private ModelMapper modelMapper = new ModelMapper();
    private AlunoRepository alunoRepository = new AlunoRepository();

    public Aluno criarAluno(AlunoDTO alunoDTO) throws Exception{

        Aluno aluno = modelMapper.map(alunoDTO, Aluno.class);

        return alunoRepository.save(aluno);

    }
}
