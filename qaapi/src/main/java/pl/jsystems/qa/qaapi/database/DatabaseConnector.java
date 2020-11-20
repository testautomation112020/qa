package pl.jsystems.qa.qaapi.database;

import pl.jsystems.qa.qaapi.configuration.ApiConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            initConnection();
        }
        return connection;
    }

    private static void initConnection() {
        try {
            Class.forName(ApiConfig.DB_CLASS);
            String url = ApiConfig.DB_URL;
            String user = ApiConfig.DB_USER;
            String pass = ApiConfig.DB_PASS;

            connection = DriverManager.getConnection(url, user, pass);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
