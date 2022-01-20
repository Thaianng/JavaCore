import controller.Controller;
import database.ConnectJDBC;
import model.User;
import service.UserService;

import java.sql.Connection;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.getUserById();
    }
}
