import connection.ConnectDatabase;
import controller.PostController;

public class Main {
    public static void main(String[] args) {
        PostController controller = new PostController();
        controller.getAllList();
    }
}
