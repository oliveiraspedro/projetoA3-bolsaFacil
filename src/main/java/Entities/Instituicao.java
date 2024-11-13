package Entities;

import java.util.ArrayList;

public class Instituicao {

    private String nomeInstituicao;
    private String sigla;
    private String cnpj;
    private String cep;
    private int numeroEndereco;
    private int numeroTelefone;
    private String nomeContato;
    private String nomeUnidade;
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
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the numeroEndereco
     */
    public int getNumeroEndereco() {
        return numeroEndereco;
    }

    /**
     * @param numeroEndereco the numeroEndereco to set
     */
    public void setNumeroEndereco(int numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    /**
     * @return the numeroTelefone
     */
    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    /**
     * @param numeroTelefone the numeroTelefone to set
     */
    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    /**
     * @return the nomeContato
     */
    public String getNomeContato() {
        return nomeContato;
    }

    /**
     * @param nomeContato the nomeContato to set
     */
    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
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
    
    

}
