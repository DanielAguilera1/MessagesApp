package messagesApp;
import com.sun.xml.internal.ws.api.message.Message;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class MessagesDAO {

    public static void CreateMessageDB(Messages message) throws SQLException{
        Conexion db_connect = new Conexion();


        try( Connection conexion = db_connect.getConnection() ){

                PreparedStatement ps = null;
                final String query= "INSERT INTO messages (message, author_mensaje) VALUES (?,?)";
                ps = conexion.prepareStatement(query);

                ps.setString(1, message.getMessage());
                ps.setString(2, message.getAuthor_message());
                ps.executeUpdate();
                System.out.println("mensaje creado");
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

    public static void ReadMessageDB(){}

    public static void DeleteMessageDB(int id_message){}

    public static void UpdateMessageDB(Message message){}












}
