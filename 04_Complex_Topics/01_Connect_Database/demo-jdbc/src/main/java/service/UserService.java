package service;

import model.Gender;
import model.User;
import util.Util;

import java.sql.*;
import java.util.ArrayList;

public class UserService {

    public ArrayList<User> getAllUser(Connection conn){
        String query = "select * from users";
        ArrayList<User> users = new ArrayList<>();

        try {
            //Tạo truy vấn
            Statement stm = conn.createStatement();

            //Thực thi truy vấn
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()){
                String id = rs.getString("id");
                String username = rs.getString("username");
                Gender gender = Gender.valueOf(rs.getString("gender"));
                String password = rs.getString("password");

                users.add(new User(id, username, gender, password));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public void addNewUser(Connection conn, String username, Gender gender, String password){
        String id = Util.randomId(5);
        String query = "insert into users (id, username, gender, password) " +
                "values ('"+id+"', '"+username+"', '"+gender+"', '"+password+"')";

        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            System.out.println("Thêm thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User searchById(Connection conn, String idUser){
        String query = "select * from users where id = '"+idUser+"'";
        User user = null;

        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()){
                String id = rs.getString("id");
                String username = rs.getString("username");
                Gender gender = Gender.valueOf(rs.getString("gender"));
                String password = rs.getString("password");
                user = new User(id, username, gender, password);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;

    }


}
