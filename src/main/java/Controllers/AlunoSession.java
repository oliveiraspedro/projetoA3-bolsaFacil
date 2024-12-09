/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Entities.Aluno;

/**
 *
 * @author Pedro
 */
public class AlunoSession {
    private static Aluno alunoLogado;

    public static Aluno getalunoLogado() {
        return alunoLogado;
    }

    public static void setalunoLogado(Aluno aluno) {
        alunoLogado = aluno;
    }
}
