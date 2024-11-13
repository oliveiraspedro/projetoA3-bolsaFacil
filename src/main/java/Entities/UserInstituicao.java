package Entities;

import Enums.UserTypes;

public class UserInstituicao {

    private String nomeInstitucional;
    private String emailInstitucional;
    private String senha;
    private UserTypes type = UserTypes.TYPE_INST;

    /**
     * @return the nomeInstitucional
     */
    public String getNomeInstitucional() {
        return nomeInstitucional;
    }

    /**
     * @param nomeInstitucional the nomeInstitucional to set
     */
    public void setNomeInstitucional(String nomeInstitucional) {
        this.nomeInstitucional = nomeInstitucional;
    }

    /**
     * @return the emailInstitucional
     */
    public String getEmailInstitucional() {
        return emailInstitucional;
    }

    /**
     * @param emailInstitucional the emailInstitucional to set
     */
    public void setEmailInstitucional(String emailInstitucional) {
        this.emailInstitucional = emailInstitucional;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    

}
