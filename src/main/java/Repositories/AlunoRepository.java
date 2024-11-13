package Repositories;

import DTOs.BolsaDTO;
import Entities.Aluno;
import Entities.Bolsas;

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

    public Aluno save(Aluno aluno){
        String sql = "INSERT INTO alunos(nome, data_nascimento, email, senha, tipo_usuario) VALUES(?,?,?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, aluno.getNomeAluno());
            stmt.setDate(2, (Date) aluno.getData_nascimento());
            stmt.setString(3, aluno.getEmail());
            stmt.setString(4, aluno.getSenha());
            stmt.setString(5, String.valueOf(aluno.getType()));
            stmt.execute();
            connection.commit();
            return aluno;

        } catch (SQLException e){
            System.out.println(e);
            return aluno;
        }
    }
    
    public List<Bolsas> findBolsas(BolsaDTO bolsaDTO){
        
        StringBuilder sql = new StringBuilder("SELECT * FROM Bolsas as end WHERE 1=1");
        
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
                bolsa.setInstituicao(resultSet.getString("instituicao"));
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
