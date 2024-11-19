/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOs;

import Enums.UserTypes;

/**
 *
 * @author Pedro
 */
public class UserInstituicaoDTO {
    private String nomeInstitucional;
    private String emailInstitucional;
    private String senha;
    private UserTypes type;

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

    /**
     * @return the type
     */
    public UserTypes getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(UserTypes type) {
        this.type = type;
    }
    
    
}
