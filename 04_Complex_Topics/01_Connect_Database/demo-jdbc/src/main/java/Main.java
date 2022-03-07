import database.ConnectJDBC;
import model.User;
import service.UserService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        UserService service = new UserService();

        ArrayList<User> listUser = service.getAllUser();
        System.out.println("Danh sách user: ");
        service.show(listUser);

        User newUser = new User();
        newUser.setUsername("tuan");
        newUser.setPassword("tuan123");
        newUser.setEmail("tuan@gmail.com");

        service.createNewUser(newUser);

        User fUser = service.findUserById(listUser, 6);
        String password = "12345";
        service.updatePassword(fUser, password);

        service.deleteUser(fUser);

    }
}
