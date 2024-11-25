package Repositories;

import DTOs.BolsaDTO;
import Entities.Aluno;
import Entities.Bolsas;
import Enums.UserTypes;
import Utils.PasswordUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AlunoRepository {

    DBConnection dbConnection = new DBConnection();
    Connection connection;

    public AlunoRepository(){

        connection = dbConnection.getConnection();

    }

    public Aluno save(Aluno aluno) throws SQLException{
        PreparedStatement stmtUsuario = null;
        PreparedStatement stmtAluno = null;

        try {
            connection.setAutoCommit(false); // Iniciar transação

            // Inserir na tabela Usuario
            String sqlUsuario = "INSERT INTO Usuario (email, senha) VALUES (?, ?)";
            stmtUsuario = connection.prepareStatement(sqlUsuario, Statement.RETURN_GENERATED_KEYS);
            stmtUsuario.setString(1, aluno.getEmail());
            String hashedPassword = PasswordUtils.hashPassword(aluno.getSenha());
            stmtUsuario.setString(2, hashedPassword);
            stmtUsuario.executeUpdate();

            // Obter o ID gerado para o Usuario
            ResultSet rsUsuario = stmtUsuario.getGeneratedKeys();
            int idUsuario = 0;
            if (rsUsuario.next()) {
                idUsuario = rsUsuario.getInt(1);
            }

            // Inserir na tabela Aluno
            String sqlAluno = "INSERT INTO Aluno (idaluno, nome, data_nascimento, tipo_user) VALUES (?, ?, ?, ?)";
            stmtAluno = connection.prepareStatement(sqlAluno);
            stmtAluno.setInt(1, idUsuario);
            stmtAluno.setString(2, aluno.getNomeAluno());
            stmtAluno.setDate(3, (Date) aluno.getData_nascimento());
            stmtAluno.setString(4, aluno.getType());
            stmtAluno.executeUpdate();
            

            // Confirmar transação
            connection.commit();
            return aluno;
        } catch (SQLException e) {
            if (connection != null) {
                connection.rollback(); // Reverter transação em caso de erro
            }
            throw e;
        } finally {
            if (stmtAluno != null) stmtAluno.close();
            if (stmtUsuario != null) stmtUsuario.close();
            if (connection != null) connection.close();
        }
    }
    
    public List<Bolsas> findBolsas(BolsaDTO bolsaDTO){
        
        StringBuilder sql = new StringBuilder("SELECT b.nome, i.nome AS nome_instituicao, b.cidade, b.preco_bolsa "
                + "FROM Bolsa b LEFT JOIN Instituicao i ON b.instituicao = i.idInsituicao = i.idInstituicao WHERE 1=1");
        
        try {
            
            Map<Integer, Object> parameters = new HashMap<>();
            Integer pos = 0;
            
            if (bolsaDTO.getNome() != null) {
                sql.append(" AND end.nome LIKE ? ");
                parameters.put(pos++, "%" + bolsaDTO.getNome() + "%");
            }
            
            if (bolsaDTO.getInstituicao()!= null) {
                sql.append(" AND end.instituicao LIKE ? ");
                parameters.put(pos++, "%" + bolsaDTO.getInstituicao()+ "%");
            }
            
            if (bolsaDTO.getCidade()!= null) {
                sql.append(" AND end.cidade LIKE ? ");
                parameters.put(pos++, "%" + bolsaDTO.getCidade() + "%");
            }
            
            if (bolsaDTO.getPrecoBolsa() != 0) {
                sql.append(" AND end.preco_bolsa <= ? ");
                parameters.put(pos++, bolsaDTO.getPrecoBolsa());
            }
                        
            PreparedStatement statement = connection.prepareStatement(sql.toString());
            
            for (Entry<Integer, Object> entry : parameters.entrySet()){
                statement.setObject(entry.getKey()+1, entry.getValue());
                System.out.println("Setting parameter index " + entry.getKey() + " with value " + entry.getValue());
            }
            
            ResultSet resultSet = statement.executeQuery();
            List<Bolsas> bolsas = new ArrayList<>();
            
            while(resultSet.next()){
                Bolsas bolsa = new Bolsas();
                bolsa.setNome(resultSet.getString("nome"));
                bolsa.setInstituicao(resultSet.getString("nome_instituicao"));
                bolsa.setCidade(resultSet.getString("cidade"));
                bolsa.setPrecoBolsa(resultSet.getDouble("preco_bolsa"));
                bolsas.add(bolsa);
            }
            return bolsas;

        } catch (SQLException e) {
            System.out.println(e + "Erro no repository");
        }
        return null;
    
    }
}
