package SingletonCode;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection databaseConnectionInstance = DatabaseConnection.createObject("connectionValue");
        System.out.println(databaseConnectionInstance);
    }
}
