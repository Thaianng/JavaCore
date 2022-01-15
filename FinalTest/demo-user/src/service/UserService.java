package service;

import model.User;
import util.Menu;
import util.Validate;

import java.util.ArrayList;

public class UserService {

    public ArrayList<User> getAllUser(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("ngoc", "ngoc@gmail.com", "123"));

        return users;
    }



    public User checkEmail(ArrayList<User> users, String email){
        for(User u: users){
            if(u.getEmail().equals(email)){
                return u;
            }
        }
        return null;
    }



}
