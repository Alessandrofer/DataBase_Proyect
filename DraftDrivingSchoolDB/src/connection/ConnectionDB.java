package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
    public static String driver = "";
    public static String url = "";
    public static String database = "";
    public static String user = "";
    public static String password = "";

    private static ConnectionDB instance;
    private Connection connection;

    private ConnectionDB() {
        try {
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el Driver: " + ex);
            }
            connection = DriverManager.getConnection(url + database + "?serverTimezone=UTC", user, password);
            System.out.println("Conectado a la base de datos " + database);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static ConnectionDB getInstance() {
        if (instance == null) {
            instance = new ConnectionDB();
        }
        return instance;
    }
}
