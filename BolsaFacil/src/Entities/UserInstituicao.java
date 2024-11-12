package Entities;

import Enums.UserTypes;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInstituicao {

    private String id;
    private String nomeInstitucional;
    private String emailInstitucional;
    private String senha;
    private UserTypes type = UserTypes.TYPE_INST;

}
