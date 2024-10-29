package Entities;
import Enums.UserTypes;
import lombok.*;

import java.util.Date;

public class Aluno implements User{

    @Getter private String email;
    @Getter @Setter private String nomeAluno;
    @Getter @Setter private String data_nascimento; // Pesquisar qual tipo de variável utilizar para formatação de datas
    private String senha;
    private UserTypes type = UserTypes.TYPE_ALUNO;


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

    public boolean cadastroAluno(String nomeAluno, String email, String senha, String data_nascimento){
        return false;
    }
}
