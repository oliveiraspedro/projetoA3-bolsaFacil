/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Entities.Instituicao;

/**
 *
 * @author Pedro
 */
public class InstSession {
    private static Instituicao instituicaoLogado;

    public static Instituicao getinstituicaoLogado() {
        return instituicaoLogado;
    }

    public static void setinstituicaoLogado(Instituicao instituicao) {
        instituicaoLogado = instituicao;
    }
}
