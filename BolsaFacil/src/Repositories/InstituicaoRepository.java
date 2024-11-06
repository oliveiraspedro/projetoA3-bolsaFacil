package Repositories;

import Entities.Aluno;
import Entities.User;
import Entities.UserInstituicao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InstituicaoRepository {

    DBConnection dbConnection = new DBConnection();
    Connection connection;

    public InstituicaoRepository(){

        connection = dbConnection.getConnection();

    }

    public UserInstituicao saveUserInstituicao(UserInstituicao userInstituicao){
        String sql = "INSERT INTO UsuarioInstituicao(nome_func, email, senha, tipo_func, instituicao) VALUES(?,?,?,?,?)";

        try {

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, userInstituicao.getNomeInstitucional());
            stmt.setString(2, userInstituicao.getEmailInstitucional());
            stmt.setString(3, userInstituicao.getSenha());
            stmt.setString(4, String.valueOf(userInstituicao.getType()));
            stmt.setString(5, userInstituicao.getNomeInstituicao());
            stmt.execute();
            connection.commit();
            return userInstituicao;

        } catch (SQLException e){
            System.out.println(e);
            return userInstituicao;
        }
    }
}
