/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Entities.Instituicao;
import Entities.UserInstituicao;
import Utils.PasswordUtils;
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
            String sqlUsuario = "INSERT INTO usuario (email, senha) VALUES (?, ?)";
            stmtUsuario = connection.prepareStatement(sqlUsuario, Statement.RETURN_GENERATED_KEYS);
            stmtUsuario.setString(1, userInstituicao.getEmailInstitucional());
            String hashedPassword = PasswordUtils.hashPassword(userInstituicao.getSenha());
            stmtUsuario.setString(2, hashedPassword);
            stmtUsuario.executeUpdate();

            // Obter o ID gerado
            ResultSet rsUsuario = stmtUsuario.getGeneratedKeys();
            int idUsuarioInstituicao = 0;
            if (rsUsuario.next()) {
                idUsuarioInstituicao = rsUsuario.getInt(1);
            }

            // Inserir na tabela Instituicao
            String sqlInstituicao = "INSERT INTO instituicao (idInstituicao, nome_instituicao, sigla, cnpj, unidade, telefone, tipo_user) VALUES (?, ?, ?, ?, ?, ?, ?)";
            stmtInstituicao = connection.prepareStatement(sqlInstituicao);
            stmtInstituicao.setInt(1, idUsuarioInstituicao);
            stmtInstituicao.setString(2, instituicao.getNomeInstituicao());
            stmtInstituicao.setString(3, instituicao.getSigla());
            stmtInstituicao.setString(4, instituicao.getCnpj());
            stmtInstituicao.setString(5, instituicao.getNomeUnidade());
            stmtInstituicao.setString(6, instituicao.getNumeroTelefone());
            stmtInstituicao.setString(7, String.valueOf(instituicao.getType().getValue()));
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
