import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{

    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
        this.connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword());

    }

    @Override
    public List<Ad> all() throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select * from ads");
        List<Ad> adlist = new ArrayList<>();
        while (rs.next()) {
            adlist.add(new Ad(
                    (long) rs.getInt("id"),
                    (long) rs.getInt("users_id"),
                    rs.getString("title"),
                    rs.getString("description"))
            );
        }
        return adlist;
    }

    @Override
    public Long insert(Ad ad) {
        Long user_id = 1L;
        String title = ad.getTitle();
        String description = ad.getDescription();

        String query = "INSERT INTO adlister_db.ads (user_id, title, description) VALUES ('" + user_id + "', '" + title + "', '" + description + "')";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            rs.next();
            long key = rs.getLong(1);
        } catch (SQLException e){
            throw new RuntimeException("Error connecting to db", e);
        }
        return;
    }
}
