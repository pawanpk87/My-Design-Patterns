package StateCode;

public class User {
    private String role;

    public User(String role) {
        this.role = role;
    }

    public boolean isAdmin() {
        return role.equals("admin");
    }
}