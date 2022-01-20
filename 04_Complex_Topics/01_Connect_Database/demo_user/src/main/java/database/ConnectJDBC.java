package database;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC {
    private String hostName = "localhost:8080";
    private String dbName = "my_database";
    private String userName = "root";
    private String password = "123";

    private String connectionURL = "jdbc:mysql://"+hostName+"/"+dbName;

    public Connection connect(){
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(connectionURL, userName, password);
            System.out.println("Kết nối thành công");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
