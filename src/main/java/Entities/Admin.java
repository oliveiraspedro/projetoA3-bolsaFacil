package Entities;

import Enums.UserTypes;

public class Admin implements User{
    
    private String email;
    private String senha;
    private String type = UserTypes.TYPE_ADMIN.getValue();
    
    public Admin(String email, String senha, String type){
        this.email = email;
        this.senha = senha;
        this.type = type;
    }

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
