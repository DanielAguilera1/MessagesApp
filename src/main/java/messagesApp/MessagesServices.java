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

    public static void ListMessages(){}

    public static void DeleteMessages(){}

    public static void EditMessage(){}
}
