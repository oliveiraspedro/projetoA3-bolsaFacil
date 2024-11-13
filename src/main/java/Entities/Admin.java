package Entities;

import Enums.UserTypes;

public class Admin implements User{
    
    private String email;
    private String senha;
    private UserTypes type = UserTypes.TYPE_ADMIN;

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getSenha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
