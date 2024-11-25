/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOs;

/**
 *
 * @author Pedro
 */
public class BolsaDTO {
    private String nome;
    private String descricaoBolsa;
    private String tipoBolsa;
    private String cidade;
    private double precoBolsa;
    private String instituicao;
    private int idInstituicao;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricaoBolsa
     */
    public String getDescricaoBolsa() {
        return descricaoBolsa;
    }

    /**
     * @param descricaoBolsa the descricaoBolsa to set
     */
    public void setDescricaoBolsa(String descricaoBolsa) {
        this.descricaoBolsa = descricaoBolsa;
    }

    /**
     * @return the tipoBolsa
     */
    public String getTipoBolsa() {
        return tipoBolsa;
    }

    /**
     * @param tipoBolsa the tipoBolsa to set
     */
    public void setTipoBolsa(String tipoBolsa) {
        this.tipoBolsa = tipoBolsa;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the precoBolsa
     */
    public double getPrecoBolsa() {
        return precoBolsa;
    }

    /**
     * @param precoBolsa the precoBolsa to set
     */
    public void setPrecoBolsa(double precoBolsa) {
        this.precoBolsa = precoBolsa;
    }

    /**
     * @return the instituicao
     */
    public String getInstituicao() {
        return instituicao;
    }

    /**
     * @param instituicao the instituicao to set
     */
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    /**
     * @return the idInstituicao
     */
    public int getIdInstituicao() {
        return idInstituicao;
    }

    /**
     * @param idInstituicao the idInstituicao to set
     */
    public void setIdInstituicao(int idInstituicao) {
        this.idInstituicao = idInstituicao;
    }
    
}
