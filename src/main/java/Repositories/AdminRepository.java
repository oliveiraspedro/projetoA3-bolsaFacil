package Repositories;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class AdminRepository {

    DBConnection dbConnection = new DBConnection();
    Connection connection;

    public AdminRepository(){

        connection = dbConnection.getConnection();

    }

    public void getAllAlunos(JTable jTable){
        String sql = "SELECT * FROM alunos";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) jTable.getModel();

            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for (int i = 0; i < cols; i++){
                colName[i] = rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colName);

                String aluno_id, nome, dataDeNascimento, email, senha;
                while (rs.next()){
                    aluno_id = rs.getString(1);
                    nome = rs.getString(2);
                    dataDeNascimento = rs.getString(3);
                    email = rs.getString(4);
                    senha = rs.getString(5);

                    String[] row = {aluno_id, nome, dataDeNascimento, email, senha};
                    model.addRow(row);
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getAllInstituicoes(JTable tblInst){
        String sql = "SELECT * FROM UsuarioInstituicao";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) tblInst.getModel();

            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for (int i = 0; i < cols; i++){
                colName[i] = rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colName);

                String id, nome, email, sigla, cnpj, cep;
                while (rs.next()){
                    id = rs.getString(1);
                    nome = rs.getString(2);
                    email = rs.getString(3);
                    sigla = rs.getString(4);
                    cnpj = rs.getString(5);
                    cep = rs.getString(6);

                    String[] row = {id, nome, email, sigla, cnpj, cep};
                    model.addRow(row);
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public boolean alterTableBolsa(int idBolsa, int colunaSelecionadaValue, int linhaSelecionadada, String novoValor, JTable tblBolsas){
        String columName = tblBolsas.getColumnName(colunaSelecionadaValue);
        Map<String, String> mapeamentoColunas = new HashMap<>();
        
        mapeamentoColunas.put("Nome do Curso", "nome");
        mapeamentoColunas.put("Descrição da Bolsa", "desc_bolsa");
        mapeamentoColunas.put("Tipo Bolsa", "tipo_bolsa");
        mapeamentoColunas.put("Preço", "preco_bolsa");
        
        String colunaBanco = mapeamentoColunas.get(columName);
        System.out.println("ColumName: " + columName);
        System.out.println("ColunaBanco: " + colunaBanco);
        
        try {
            String sql = "UPDATE Bolsa SET " + colunaBanco + " = ? WHERE idbolsa = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setObject(1, novoValor); // Define o novo valor
            stmt.setInt(2, idBolsa); // Define o identificador
            int linhasAfetadas = stmt.executeUpdate();

            return linhasAfetadas > 0;
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar a coluna: " + ex.getMessage());
            ex.printStackTrace();
        }
        
        return false;
    }
    
    public boolean deleteBolsa(int idBolsa){
        String sql = "DELETE from bolsa WHERE idbolsa = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setInt(1, idBolsa);
            
            int linhasAfetadas = stmt.executeUpdate();
            
            return linhasAfetadas > 0;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void clear(DefaultTableModel model){
        model.setRowCount(0);
    }

}
