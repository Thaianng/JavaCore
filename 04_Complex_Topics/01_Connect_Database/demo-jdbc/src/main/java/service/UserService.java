package service;

import database.ConnectJDBC;
import model.User;

import java.sql.*;
import java.util.ArrayList;

public class UserService {
    Connection conn;
    public UserService(){
        conn = ConnectJDBC.connect();
    }

    public ArrayList<User> getAllUser(){
        ArrayList<User> listUser = new ArrayList<>();
        String query = "SELECT * FROM users";

        Statement stm = null;
        try {
            //Tạo đối tượng Statement
            stm = conn.createStatement();

            //Thực thi truy vấn và trả về đối tượng ResultSet
            ResultSet rs = stm.executeQuery(query);

            //Duyệt kết quả trả về
            while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String email = rs.getString("email");

                listUser.add(new User(id, username, password, email));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listUser;

    }

    public void show(ArrayList<User> list){
        list.forEach(i -> System.out.println(i));
    }

    public User findUserById(ArrayList<User> list, int findId){
       User fUser = null;
       for(User u: list){
           if(u.getId() == findId){
               fUser = u;
           }
       }
        return fUser;
    }

    public void createNewUser(User newUser){
        String query = "INSERT INTO users(id, username, password, email) " +
                "VALUES (null, ?,?,?)";

        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement(query);

            pstm.setString(1, newUser.getUsername());
            pstm.setString(2, newUser.getPassword());
            pstm.setString(3, newUser.getEmail());

            int row = pstm.executeUpdate();
            if(row != 0){
                System.out.println("Thêm thành công " + row);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void updatePassword(User user, String newPassword){
        String query = "UPDATE users SET password = ? WHERE id = ?";

        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement(query);

            pstm.setString(1, newPassword);
            pstm.setInt(2, user.getId());

            int row = pstm.executeUpdate();
            if(row != 0){
                System.out.println("Cập nhật thành công " + row);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deleteUser(User user){
        String query = "DELETE FROM users WHERE id = ?";

        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement(query);

            pstm.setInt(1, user.getId());

            //Khi thực hiện các lệnh insert/update/delete sử dụng executeUpdate, nó sẽ trả về số hàng bị tác động
            int row = pstm.executeUpdate();
            if(row != 0){
                System.out.println("Xóa thành công " + row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
