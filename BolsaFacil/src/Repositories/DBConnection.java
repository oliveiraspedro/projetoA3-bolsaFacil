package Repositories;

import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    @Getter private Connection connection;
    private final String url = "jdbc:mysql://127.0.0.1:3306/BolsaFacilExample";
    private final String userName = "root";
    private final String pwd = "rootPwd";

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
