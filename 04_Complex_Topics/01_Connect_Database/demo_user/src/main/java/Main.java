import database.ConnectJDBC;
import mock_data.MockDataUser;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
       Controller controller = new Controller();
       controller.updateUsername();
    }
}
