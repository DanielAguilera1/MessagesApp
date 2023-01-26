package messagesApp;
import java.sql.SQLException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("-------------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. Crear Mensaje");
            System.out.println("2. Listar Mensajes");
            System.out.println("3. Editar un mensaje");
            System.out.println("4. Eliminar un mensaje");
            System.out.println("5. Salir");
            System.out.println("-------------------------");

            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    MessagesServices.CreateMessage();
                break;
                case 2:
                    MessagesServices.ListMessages();
                    break;
                case 3:
                    MessagesServices.EditMessage();
                    break;
                case 4:
                    MessagesServices.DeleteMessages();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Selecciona algo valido");
                    opcion = sc.nextInt();
            }

        } while(opcion != 5);

    }
}
