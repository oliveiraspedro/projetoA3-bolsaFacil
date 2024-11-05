package Entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
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

}
