package SingletonCode;

public final class DatabaseConnection {
    private static DatabaseConnection databaseConnectionInstance;
    public String value;

    private DatabaseConnection(String value) {
        this.value = value;
    }

    public static DatabaseConnection createObject(String value) {
        if (databaseConnectionInstance == null) {
            databaseConnectionInstance = new DatabaseConnection(value);
        }
        return databaseConnectionInstance;
    }

    @Override
    public String toString() {
        return "DatabaseConnection [value=" + value + "]";
    }
}
