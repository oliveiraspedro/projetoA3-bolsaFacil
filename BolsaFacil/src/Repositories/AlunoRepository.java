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
        String sql = "INSERT INTO alunos(email, nome, senha, dataDeNascimento) VALUES(?,?,?,?)";

        try {

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, aluno.getEmail());
            stmt.setString(2, aluno.getNomeAluno());
            stmt.setString(3, aluno.getSenha());
            stmt.setString(4, String.valueOf(aluno.getData_nascimento()));
            stmt.execute();
            connection.commit();
            return aluno;

        } catch (SQLException e){
            System.out.println(e);
            return aluno;
        }
    }

}
