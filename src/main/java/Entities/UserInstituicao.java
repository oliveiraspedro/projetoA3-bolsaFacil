package Entities;

import Enums.UserTypes;

public class UserInstituicao {

    private String emailInstitucional;
    private String senha;

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
