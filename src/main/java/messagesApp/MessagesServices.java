package messagesApp;
import java.sql.SQLException;
import java.util.Scanner;

public class MessagesServices {

    public static void CreateMessage() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String message = sc.nextLine();

        System.out.println("Tu nombre");
        String author = sc.nextLine();

        Messages registro = new Messages();
        registro.setMessage(message);
        registro.setAuthor_message(author);
        MessagesDAO.CreateMessageDB(registro);
    }

    public static void ListMessages() throws SQLException {
        MessagesDAO.ReadMessageDB();
    }

    public static void DeleteMessages() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el ID de tu mensaje");
        int id = sc.nextInt();
        MessagesDAO.DeleteMessageDB(id);
    }

    public static void EditMessage() throws SQLException{

        Scanner sc = new Scanner(System.in);

        System.out.println("ID del mensaje a editar ");
        int id_Message = sc.nextInt();

        sc.nextLine();

        System.out.println("Coloque el mensaje nuevo");
        String message = sc.nextLine();

        MessagesDAO.UpdateMessageDB(id_Message, message);
    }


















}
