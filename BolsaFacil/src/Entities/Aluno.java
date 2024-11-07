package Entities;
import Enums.UserTypes;
import lombok.*;

@Getter
@Setter
public class Aluno implements User{

    private long id;
    private String email;
    private String nomeAluno;
    private String data_nascimento; // Pesquisar qual tipo de variável utilizar para formatação de datas
    private String senha;
    private UserTypes type = UserTypes.TYPE_ALUNO;

    public Aluno(){}

    public Aluno(String email, String nomeAluno, String  data_nascimento, String senha) {
        this.email = email;
        this.nomeAluno = nomeAluno;
        this.data_nascimento = data_nascimento;
        this.senha = senha;
    }

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
