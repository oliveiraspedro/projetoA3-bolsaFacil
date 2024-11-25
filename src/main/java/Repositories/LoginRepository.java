package Repositories;

import Entities.Admin;
import Entities.Aluno;
import Entities.Instituicao;
import Entities.User;
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

    public User findByEmail(String email, String senha) throws SQLException{

        // TO DO: Verificar se o email existe
        String sql = "SELECT COALESCE(al.tipo_user, ui.tipo_user) AS tipo_user, u.senha, u.email, ui.idInstituicao AS idInstituicao, ui.nome_instituicao AS nome_instituicao, ui.sigla AS sigla, ui.cnpj AS cnpj, ui.telefone AS telefone, ui.unidade AS unidade FROM usuario u LEFT JOIN aluno al ON u.idusuario = al.idaluno LEFT JOIN instituicao ui ON u.idusuario = ui.idInstituicao WHERE u.email = ?";
        //String sql = "SELECT * FROM usuario u LEFT JOIN aluno al ON u.idusuario = al.idaluno LEFT JOIN instituicao ui ON u.idusuario = ui.idInstituicao WHERE u.email = ?";

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
                        switch(userType){
                            case UserTypes.TYPE_ADMIN:
                                return new Admin(resultSet.getString("email"), resultSet.getString("senha"), resultSet.getString("tipo_user"));
                            case UserTypes.TYPE_ALUNO:
                                return new Aluno(resultSet.getString("email"), resultSet.getString("nome"), resultSet.getDate("data_nascimento"), resultSet.getString("senha"), resultSet.getString("tipo_user"));
                            case UserTypes.TYPE_INST:
                                return new Instituicao(resultSet.getInt("idInstituicao"), resultSet.getString("email"), resultSet.getString("senha"), resultSet.getString("nome_instituicao"), resultSet.getString("sigla"), resultSet.getString("cnpj"), resultSet.getString("telefone"), resultSet.getString("unidade"), resultSet.getString("tipo_user"));
                        }
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
