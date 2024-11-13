package Repositories;

import Entities.Aluno;

import java.sql.*;

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
}
