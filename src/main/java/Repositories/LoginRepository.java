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

    public UserTypes findByEmail(String email, String senha) throws SQLException{

        // TO DO: Verificar se o email existe
        String sql = "SELECT COALESCE(al.tipo_user, ui.tipo_user) AS tipo_user, u.senha, u.email FROM usuario u LEFT JOIN aluno al ON u.idusuario = al.idaluno LEFT JOIN instituicao ui ON u.idusuario = ui.idInstituicao WHERE u.email = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, email);
            //statement.setString(2, senha);
            System.out.println("Parâmetros definidos: Email = " + email);
            
            ResultSet resultSet = statement.executeQuery();
            System.out.println("Consulta SQL executada.");
            System.out.println("SQL executada: " + statement.toString());

            if (resultSet.next()){
                String senhaArmazenada = resultSet.getString("senha");

                // Verificar se a senha inserida corresponde ao hash
                String userTypeString = resultSet.getString("tipo_user");
                System.out.println("userTypeString: " + userTypeString);
                
                System.out.println("Senha inserida: " + senha);
                System.out.println("Senha armazenada no banco: " + senhaArmazenada);
                System.out.println("Resultado da comparação: " + PasswordUtils.checkPassword(senha, senhaArmazenada));
                        
                if (PasswordUtils.checkPassword(senha, senhaArmazenada)) {
                
                    UserTypes userType = UserTypes.fromString(userTypeString);
                    System.out.println("userType " + userType);
                    
                    if (userType != null) {
                        return userType;
                    } else {
                        System.out.println("Tipo de usuário desconhecido: " + userTypeString);
                }
            }
        }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;

    }

}
