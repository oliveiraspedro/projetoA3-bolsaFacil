package Repositories;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private Connection connection;
    private final String url = "jdbc:mysql://127.0.0.1:3306/bolsafacil";
    private final String userName = "root";
    private final String pwd = "Pedro021";

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

    /**
     * @return the connection
     */
    public Connection getConnection() {
        return connection;
    }
    
    
}
