package Elements;

import java.io.Serializable;

public class Message implements Serializable {
    private String source;
    private String message;
    private String dest;

    public Message(String source, String message, String dest) {
        this.source = source;
        this.message = message;
        this.dest = dest;
    }

    public String getMessage() {
        return message;
    }

    public String getSource() {
        return source;
    }

    public String getDest() {
        return dest;
    }
}
