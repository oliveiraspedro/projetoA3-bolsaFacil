package Repositories;

import Entities.Aluno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoRepository {

    private Connection connection;
    private final String url = "";
    private final String userName = "";
    private final String pwd = "";

    public AlunoRepository(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, userName, pwd);

            System.out.println("Conexão estabelecidade com sucesso!");

        } catch (Exception e){
            e.printStackTrace();
        }
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

    public Aluno update(Aluno aluno){
        return aluno;
    }

    public Aluno delete(Aluno aluno){
        return aluno;
    }
}
