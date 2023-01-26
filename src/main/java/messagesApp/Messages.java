package messagesApp;

public class Messages {

    private int id_message;
    private String message;
    private String author_message;
    private String time_message;


    public Messages(String message, String author_message) {
        this.message = message;
        this.author_message = author_message;
    }

    public Messages() {
    }


    // Getter & Setters

    public int getId_message() {
        return id_message;
    }

    public void setId_message(int id_mssage) {
        this.id_message = id_message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor_message() {
        return author_message;
    }

    public void setAuthor_message(String author_message) {
        this.author_message = author_message;
    }

    public String getTime_message() {
        return time_message;
    }

    public void setTime_message(String time_message) {
        this.time_message = time_message;
    }


}
