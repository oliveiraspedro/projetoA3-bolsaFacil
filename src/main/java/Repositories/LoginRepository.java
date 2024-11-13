package Repositories;

import Entities.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginRepository {

    DBConnection dbConnection = new DBConnection();
    Connection connection;

    public LoginRepository(){

        connection = dbConnection.getConnection();

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
                        resultSet.getDate("data_nascimento"), // TO DO: Alterar o tipo do data_nascimento para Date ou LocalDate
                        resultSet.getString("senha")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

}
