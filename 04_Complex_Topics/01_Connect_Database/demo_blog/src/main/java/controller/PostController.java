package controller;

import connection.ConnectDatabase;
import model.Post;
import service.PostService;

import java.sql.Connection;
import java.util.ArrayList;

public class PostController {
    ConnectDatabase connectDatabase;
    Connection conn;
    PostService postService;

    public PostController() {
        connectDatabase = new ConnectDatabase();
        conn = connectDatabase.connect();
        postService = new PostService();
    }

    public void getAllList(){
        ArrayList<Post> posts = postService.getAllPost(conn);
        posts.forEach(i -> System.out.println(i));
    }

    public void show(ArrayList<?> list){
        list.forEach(i -> System.out.println(i));
    }
}
