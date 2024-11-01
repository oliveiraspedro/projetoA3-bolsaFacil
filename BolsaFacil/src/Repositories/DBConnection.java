package Repositories;

import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    @Getter private Connection connection;
    private final String url = "";
    private final String userName = "";
    private final String pwd = "";

    // TO DO: Estabelecer a conexão com o banco de dados

    public DBConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, userName, pwd);

            System.out.println("Conexão estabelecidade com sucesso!");

        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
