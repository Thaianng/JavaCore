package mock_data;

import model.Gender;
import util.GenerateId;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MockDataUser {

    public void insertUser(Connection conn){

        String[] usernames = new String[]{"kem", "do", "luom"};

        for(int i = 0; i < 3; i++){
            String id = GenerateId.randomId(5);
            String query = "INSERT INTO `users`(`id`, `username`, `password`, `email`, `mobile`, `gender`, `avatar`) " +
                    "VALUES ('"+id+"','"+usernames[i]+"','"+usernames[i]+"123456" +"','"+usernames[i]+"@gmail.com"+"','0123456789','female', 'https://drive.google.com/file/d/1EahHjI947g8CMHj5KkkniRl3fg6OJIyx/view?usp=sharing')";

            try {
                Statement stm = conn.createStatement();
                stm.executeUpdate(query);
                System.out.println("Thêm thành công");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
