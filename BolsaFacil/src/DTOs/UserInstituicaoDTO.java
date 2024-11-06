package DTOs;

import Enums.UserTypes;
import com.mysql.cj.util.StringInspector;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInstituicaoDTO extends InstituicaoDTO{

    public String nomeInstituicional;
    public String emailInstitucional;
    public String senha;
    public UserTypes type;
    public String nomeInstituicao;

}
