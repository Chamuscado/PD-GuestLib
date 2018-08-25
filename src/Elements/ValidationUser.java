package Elements;

import java.io.Serializable;

public class ValidationUser implements Serializable {
    private int code;
    private String username;

    public ValidationUser(String username, int code) {
        this.code = code;
        this.username = username;
    }

    public int getCode() {
        return code;
    }

    public String getUsername() {
        return username;
    }
}
