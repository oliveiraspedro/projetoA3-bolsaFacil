package Entities;

import Enums.UserTypes;
import java.util.ArrayList;

public class Instituicao implements User{

    private String email;
    private String senha;
    private String nomeInstituicao;
    private String sigla;
    private String cnpj;
    private String numeroTelefone;
    private String nomeUnidade;
    private UserTypes type = UserTypes.TYPE_INST;
    private ArrayList<Bolsas> bolsas = new ArrayList<>();

    /**
     * @return the nomeInstituicao
     */
    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    /**
     * @param nomeInstituicao the nomeInstituicao to set
     */
    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    /**
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the numeroTelefone
     */
    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    /**
     * @param numeroTelefone the numeroTelefone to set
     */
    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    /**
     * @return the nomeUnidade
     */
    public String getNomeUnidade() {
        return nomeUnidade;
    }

    /**
     * @param nomeUnidade the nomeUnidade to set
     */
    public void setNomeUnidade(String nomeUnidade) {
        this.nomeUnidade = nomeUnidade;
    }

    /**
     * @return the bolsas
     */
    public ArrayList<Bolsas> getBolsas() {
        return bolsas;
    }

    /**
     * @param bolsas the bolsas to set
     */
    public void setBolsas(ArrayList<Bolsas> bolsas) {
        this.bolsas = bolsas;
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
        return senha;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the type
     */
    public UserTypes getType() {
        return type;
    }

}
