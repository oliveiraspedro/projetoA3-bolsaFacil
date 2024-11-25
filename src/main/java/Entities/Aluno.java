package Entities;
import Enums.UserTypes;

import java.util.Date;

public class Aluno implements User{

    private long id;
    private String email;
    private String nomeAluno;
    private Date data_nascimento; // Pesquisar qual tipo de variável utilizar para formatação de datas
    private String senha;
    private String type = UserTypes.TYPE_ALUNO.getValue();

    public Aluno(){}

    public Aluno(String email, String nomeAluno, Date data_nascimento, String senha, String type) {
        this.email = email;
        this.nomeAluno = nomeAluno;
        this.data_nascimento = data_nascimento;
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
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the nomeAluno
     */
    public String getNomeAluno() {
        return nomeAluno;
    }

    /**
     * @param nomeAluno the nomeAluno to set
     */
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    /**
     * @return the data_nascimento
     */
    public Date getData_nascimento() {
        return data_nascimento;
    }

    /**
     * @param data_nascimento the data_nascimento to set
     */
    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    @Override
    public String getSenha() {
        return senha;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    
}
