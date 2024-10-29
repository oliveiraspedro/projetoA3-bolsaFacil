package Entities;
import Enums.UserTypes;
import lombok.*;

import java.util.Date;

@Getter
@Setter
public class Aluno implements User{

    private long id;
    private String email;
    private String nomeAluno;
    private String data_nascimento; // Pesquisar qual tipo de variável utilizar para formatação de datas
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
