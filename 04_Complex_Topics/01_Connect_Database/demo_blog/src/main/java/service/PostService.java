package service;

import connection.ConnectDatabase;
import model.Post;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class PostService {


    public ArrayList<Post> getAllPost(Connection conn){
        ArrayList<Post> posts = new ArrayList<>();
        String query = "SELECT p.id, p.title, p.description , p.thumnail , p.create_at \n" +
                        "FROM post p\n" +
                        "WHERE p.status = 'public'\n" +
                        "ORDER BY p.create_at DESC";

        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String description = rs.getString("description");
                String thumnail = rs.getString("thumnail");
                Date date = rs.getDate("create_at");

                posts.add(new Post(id, title, description,thumnail, date));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return posts;
    }


}
