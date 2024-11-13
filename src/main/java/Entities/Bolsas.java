package Entities;

public class Bolsas {
    private String nome;
    private String descricaoBolsa;
    private String tipoBolsa;
    private double precoBolsa;
    private Instituicao instituicao;

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
    public Instituicao getInstituicao() {
        return instituicao;
    }

    /**
     * @param instituicao the instituicao to set
     */
    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }
    
    

}
