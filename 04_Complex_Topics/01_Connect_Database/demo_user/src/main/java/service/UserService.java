package service;

import model.Gender;
import model.User;
import util.GenerateId;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserService {

    public  ArrayList<User> getListUser(Connection conn){
        String query = "SELECT * FROM users";
        ArrayList<User> users = new ArrayList<>();

        try {
            Statement stm = conn.createStatement();
            ResultSet rs =  stm.executeQuery(query);

            while (rs.next()){
                String id = rs.getString("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String email = rs.getString("email");
                String mobile = rs.getString("mobile");
                Gender gender = Gender.valueOf(rs.getString("gender"));
                String avatar = rs.getString("avatar");

                users.add(new User(id, username, password, email, mobile, gender, avatar));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;

    }



    public void addNewUser(Connection conn, String username, String password, String email, String mobile, Gender gender, String avatar){
        String id = GenerateId.randomId(5);
        String query = "INSERT INTO `users`(`id`, `username`, `password`, `email`, `mobile`, `gender`, `avatar`) " +
                "VALUES ('"+id+"','"+username+"','"+password+"','"+email+"','"+mobile+"','"+gender+"', '"+avatar+"')";

        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            System.out.println("Thêm thành công");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User getUserById(Connection conn){
        String id = "AeOQS";
        User user = null;
        String query = "SELECT * FROM users WHERE id = '"+id+"'";
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()){
                String id_user = rs.getString("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String email = rs.getString("email");
                String mobile = rs.getString("mobile");
                Gender gender = Gender.valueOf(rs.getString("gender"));
                String avatar = rs.getString("avatar");

                user = new User(id_user, username, password, email, mobile, gender, avatar);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public void deleteUser(Connection conn, User user){

        String query = "DELETE FROM `users` WHERE id = '"+user.getId()+"'";
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            System.out.println("Xóa thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUsername(Connection conn, User user, String newUsername){
        String query = "UPDATE users SET username = '"+newUsername+"' WHERE id = '"+user.getId()+"'";
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            System.out.println("Cập nhật thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
