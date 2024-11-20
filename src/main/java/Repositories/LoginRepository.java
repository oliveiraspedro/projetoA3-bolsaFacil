package Repositories;

import Entities.Aluno;
import Enums.UserTypes;
import Utils.PasswordUtils;

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

    public UserTypes findByEmail(String email, String senha){

        // TO DO: Verificar se o email existe
        String sql = "SELECT * FROM Usuario u LEFT JOIN aluno al ON u.id = al.id LEFT JOIN UsuarioInstituicao ui ON u.id = ui.id WHERE u.email = ? AND u.senha = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, email);
            
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()){
                String senhaArmazenada = resultSet.getString("senha");

                // Verificar se a senha inserida corresponde ao hash
                String userTypeString = resultSet.getString("tipo_usurio");
                if (PasswordUtils.checkPassword(senha, senhaArmazenada)) {
                    return UserTypes.fromString(userTypeString);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;

    }

}
