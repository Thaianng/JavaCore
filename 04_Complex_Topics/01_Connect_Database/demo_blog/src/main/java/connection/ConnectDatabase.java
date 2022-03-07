package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
    private String hostName = "localhost:8087";
    private String dbName = "blog";
    private String username = "root";
    private String password = "123";

    private String connectURL = "jdbc:mysql://"+hostName+"/"+dbName;

    public Connection connect(){
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(connectURL, username, password);
            System.out.println("Kết nối thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;

    }
}
