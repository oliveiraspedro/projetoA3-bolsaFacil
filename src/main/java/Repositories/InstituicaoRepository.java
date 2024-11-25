/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Entities.Bolsas;
import Entities.Instituicao;
import Entities.UserInstituicao;
import Utils.PasswordUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
            stmtInstituicao.setString(7, instituicao.getType());
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
    
    public void getAllBolsas(JTable tblBolsas, Instituicao instituicao){
        String sql = "SELECT * FROM bolsa WHERE idInstituicao = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, instituicao.getIdIntituicao());
            ResultSet rs = stmt.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) tblBolsas.getModel();

            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            model.setRowCount(0);
            if (rsmd == null) {
                JOptionPane.showMessageDialog(null, "Nenhuma bolsa cadastrada!");
            } else {
                for (int i = 0; i < cols; i++){
                    colName[i] = rsmd.getColumnName(i+1);
                    model.setColumnIdentifiers(colName);

                    String idbolsa, nome, desc_bolsa, tipo_bolsa, preco_bolsa;
                    while (rs.next()){
                        idbolsa = rs.getString(1);
                        nome = rs.getString(2);
                        desc_bolsa = rs.getString(3);
                        tipo_bolsa = rs.getString(4);
                        preco_bolsa = rs.getString(5);

                        String[] row = {idbolsa, nome, desc_bolsa, tipo_bolsa, preco_bolsa};
                        model.addRow(row);
                    }
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public boolean addBolsas(Bolsas bolsa){
        String sql = "INSERT INTO bolsa (nome, desc_bolsa, tipo_bolsa, preco_bolsa, idInstituicao) VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Configurando os valores do PreparedStatement
            preparedStatement.setString(1, bolsa.getNome());
            preparedStatement.setString(2, bolsa.getDescricaoBolsa());
            preparedStatement.setString(3, bolsa.getTipoBolsa());
            preparedStatement.setDouble(4, bolsa.getPrecoBolsa());
            preparedStatement.setInt(5, bolsa.getIdInstituicao());

            // Executando a instrução SQL
            int rowsAffected = preparedStatement.executeUpdate();

            // Retorna true se uma linha foi inserida
            return rowsAffected > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
