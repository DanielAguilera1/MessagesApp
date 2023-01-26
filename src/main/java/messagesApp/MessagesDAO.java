package messagesApp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MessagesDAO {

    public static void CreateMessageDB(Messages message) throws SQLException{
        Conexion db_connect = new Conexion();


        try( Connection conexion = db_connect.getConnection() ){

                PreparedStatement ps = null;
                final String query= "INSERT INTO messages (message, author_message) VALUES (?,?)";
                ps = conexion.prepareStatement(query);

                ps.setString(1, message.getMessage());
                ps.setString(2, message.getAuthor_message());
                ps.executeUpdate();
                System.out.println("mensaje creado");
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

    public static void ReadMessageDB() throws SQLException{
        Conexion db_connect = new Conexion();


        try( Connection conexion = db_connect.getConnection() ){

            PreparedStatement ps = null;
            ResultSet rs = null;

            final String query = "SELECT * FROM messages";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("ID: " + rs.getInt("id_message"));
                System.out.println("Message: " + rs.getString("message"));
                System.out.println("Autor: " + rs.getString("author_message"));
                System.out.println("Fecha: " + rs.getString("date_message"));
                System.out.println();
            }


        } catch (SQLException e){
            System.out.println(e);
        }



    }

    public static void UpdateMessageDB(int id_message, String message) throws SQLException{
        Conexion db_connect = new Conexion();


        try( Connection conexion = db_connect.getConnection() ){

            PreparedStatement ps = null;
            final String query = "UPDATE messages SET message = ? WHERE id_message = ?";

            ps = conexion.prepareStatement(query);
            ps.setString(1, message);
            ps.setInt(2, id_message);
            ps.executeUpdate();
            System.out.println("El mensaje se actualizo correctamente");

        } catch (SQLException e){
            System.out.println("No se logro actualizar el mensaje");
            System.out.println(e);
        }
    }

    public static void DeleteMessageDB(int id_message) throws SQLException{
        Conexion db_connect = new Conexion();


        try( Connection conexion = db_connect.getConnection() ){
            PreparedStatement ps = null;

            final String query = "DELETE FROM messages WHERE id_message = ?";
            ps = conexion.prepareStatement(query);
            ps.setInt(1, id_message);
            ps.executeUpdate();
            System.out.println("El mensaje ha sido Borrado");
            System.out.println();

        } catch (SQLException e){
            System.out.println(e);
            System.out.println("No se logro borrar el mensaje");
        }
    }

}
