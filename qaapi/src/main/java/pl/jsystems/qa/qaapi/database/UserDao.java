package pl.jsystems.qa.qaapi.database;

import pl.jsystems.qa.qaapi.database.model.UserDb;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public static List<UserDb> getAllUsers() {
        List<UserDb> userDbs = new ArrayList<>();

        String sql = "select * from testuser";

        Statement statement = null;
        ResultSet wynik = null;
        try {
            statement = DatabaseConnector.getConnection().createStatement();

            wynik = statement.executeQuery(sql);

            while (wynik.next()) {
                UserDb userDb = new UserDb(wynik.getLong(1), wynik.getString(2), wynik.getString(3));
                userDbs.add(userDb);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                wynik.close();
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return userDbs;
    }
}
