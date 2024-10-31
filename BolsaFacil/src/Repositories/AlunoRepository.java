package Repositories;

import Entities.Aluno;

import java.sql.*;

public class AlunoRepository {

    private Connection connection;
    private final String url = "";
    private final String userName = "";
    private final String pwd = "";

    // TO DO: Estabelecer a conexão com o banco de dados

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

    public Aluno findByEmail(String email){

        // TO DO: Verificar se o email existe
        String sql = "SELECT * FROM alunos WHERE email = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, email);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return new Aluno(
                        resultSet.getString("email"),
                        resultSet.getString("nome"),
                        resultSet.getString("data_nascimento"), // TO DO: Alterar o tipo do data_nascimento para Date ou LocalDate
                        resultSet.getString("senha")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

}
