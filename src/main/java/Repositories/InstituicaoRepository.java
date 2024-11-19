/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Entities.Instituicao;
import Entities.UserInstituicao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Pedro
 */
public class InstituicaoRepository {
    DBConnection dbConnection = new DBConnection();
    Connection connection;

    public InstituicaoRepository(){

        connection = dbConnection.getConnection();

    }
    
    public UserInstituicao save(UserInstituicao userInstituicao, Instituicao instituicao) throws SQLException{
        PreparedStatement stmtUsuario = null;
        PreparedStatement stmtInstituicao = null;
        
        try {
            connection.setAutoCommit(false); // Iniciar transação

            // Inserir na tabela UsuarioInstituicao
            String sqlUsuario = "INSERT INTO UsuarioInstituicao (email_contato, nome_contato, senha) VALUES (?, ?, ?)";
            stmtUsuario = connection.prepareStatement(sqlUsuario, Statement.RETURN_GENERATED_KEYS);
            stmtUsuario.setString(1, userInstituicao.getEmailInstitucional());
            stmtUsuario.setString(2, userInstituicao.getNomeInstitucional());
            stmtUsuario.setString(3, userInstituicao.getSenha());
            stmtUsuario.executeUpdate();

            // Obter o ID gerado
            ResultSet rsUsuario = stmtUsuario.getGeneratedKeys();
            int idUsuarioInstituicao = 0;
            if (rsUsuario.next()) {
                idUsuarioInstituicao = rsUsuario.getInt(1);
            }

            // Inserir na tabela Instituicao
            String sqlInstituicao = "INSERT INTO Instituicao (nome_instituicao, unidade, telefone_instituicao, sigla, cnpj, id_usuario_instituicao) " +
                                    "VALUES (?, ?, ?, ?, ?, ?)";
            stmtInstituicao = connection.prepareStatement(sqlInstituicao);
            stmtInstituicao.setString(1, instituicao.getNomeInstituicao());
            stmtInstituicao.setString(2, instituicao.getNomeUnidade());
            stmtInstituicao.setString(3, instituicao.getNumeroTelefone());
            stmtInstituicao.setString(4, instituicao.getSigla());
            stmtInstituicao.setString(5, instituicao.getCnpj());
            stmtInstituicao.setInt(6, idUsuarioInstituicao);
            stmtInstituicao.executeUpdate();

            connection.commit(); // Confirmar transação
            return userInstituicao;
        } catch (SQLException e) {
            if (connection != null) {
                connection.rollback(); // Reverter transação em caso de erro
            }
            throw e;
        } finally {
            if (stmtInstituicao != null) stmtInstituicao.close();
            if (stmtUsuario != null) stmtUsuario.close();
            if (connection != null) connection.close();
        }
    }
    
}
