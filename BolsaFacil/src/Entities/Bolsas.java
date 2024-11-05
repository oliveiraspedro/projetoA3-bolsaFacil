package Entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bolsas {

    private String nome;
    private String descricaoBolsa;
    private String tipoBolsa;
    private double precoBolsa;
    private Instituicao instituicao;

}
