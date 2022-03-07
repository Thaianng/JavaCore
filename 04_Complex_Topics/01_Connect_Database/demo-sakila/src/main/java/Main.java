import java.sql.Connection;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection conn = connectJDBC.connect();

        FilmService service = new FilmService();
        ArrayList<Film> list = service.getAllFilm(conn);
        for(Film f: list){
            System.out.println(f);
        }
    }
}
