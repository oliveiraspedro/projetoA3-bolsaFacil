package DTOs;

import Enums.UserTypes;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
public class AlunoDTO {
    public String email;
    public String senha;
    public String nome;
    public String data_nascimento;
    public UserTypes type;
}
