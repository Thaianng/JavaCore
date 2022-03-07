import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FilmService {
    public ArrayList<Film> getAllFilm(Connection con){
        ArrayList<Film> films = new ArrayList<>();
        String query = "SELECT title, description, release_year, length, rating,JSON_ARRAYAGG(name) as category\n" +
                "FROM film\n" +
                "INNER JOIN film_category ON film.film_id = film_category.film_id\n" +
                "INNER JOIN category ON film_category.category_id = category.category_id\n" +
                "WHERE rating = 'PG'\n" +
                "GROUP BY film.film_id";

        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()){
                String title = rs.getString("title");
                String description = rs.getString("description");
                int release_year = rs.getInt("release_year");
                int length = rs.getInt("length");
                String rating = rs.getString("rating");
                String category = rs.getString("category");


                films.add(new Film(title, description, release_year, length, rating, category));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return films;
    }
}
