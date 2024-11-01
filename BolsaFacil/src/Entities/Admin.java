package Entities;

import Enums.UserTypes;
import lombok.Getter;

public class Admin implements User{

    @Getter private String email;
    private String senha;
    private UserTypes type = UserTypes.TYPE_ADMIN;

    @Override
    public void setEmail() {

    }

    @Override
    public void setSenha() {

    }

    @Override
    public boolean login() {
        return false;
    }

    @Override
    public boolean logout() {
        return false;
    }
}
