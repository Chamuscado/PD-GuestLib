package Elements;

import java.io.Serializable;

public class MessagePair implements Serializable {
    private String username0;
    private String username1;

    public MessagePair(String username0, String username1) {
        this.username0 = username0;
        this.username1 = username1;
    }

    public String getUsername0() {
        return username0;
    }

    public String getUsername1() {
        return username1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessagePair) {
            MessagePair pair = (MessagePair) obj;
            if (pair.username1.equals(username1) && pair.username0.equals(username0))
                return true;
            if (pair.username1.equals(username0) && pair.username0.equals(username1))
                return true;
        }
        return false;
    }

    public boolean contains(String username) {
        return username0.equals(username) || username1.equals(username);
    }

    @Override
    public int hashCode() {
        return username0.hashCode() * username1.hashCode();
    }

    @Override
    public String toString() {
        return "(" + username0 + ":" + username1 + ")";
    }
}

