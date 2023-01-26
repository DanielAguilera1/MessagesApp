package messagesApp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {


    public Connection getConnection() {
        Connection connection = null;

        try {
            String url = "jdbc:mysql://localhost:3307/messages_app";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "");
            connection = DriverManager.getConnection(url, info);


        } catch (SQLException e){
            System.out.println(e);
        }

        return connection;
    }
}
