import java.io.Serializable;

public class User implements Serializable {
    public String username;
    public String name;
    public String password;

    public User(String name, String username, String password) {
        this.name = name;
        this.password = password;
        this.username = username;
    }
}