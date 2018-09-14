package Elements;

import java.io.Serializable;

public class User implements Serializable {

    public String username;
    public String name;
    public String password;
    public boolean parFormado;

    public User(String name, String username, String password, boolean parFormado) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.parFormado = parFormado;
    }

    public User(String name, String username, String password) {
        this(name, username, password, false);
    }

    public User(String username) {
        this("", username);
    }

    public User(String name, String username) {
        this(name, username, "");
    }

    @Override
    public String toString() {
        return "Name: " + name + " UserName: " + username + " PassWord: " + password;
    }

    public String toStringNameAndUserName() {
        return String.format("%s (%s)", name, username);
    }    public String toStringNameUserNameParFormado() {
        return String.format("%s (%s) %s", name, username, parFormado ? "Par Formado" : "");
    }
}
