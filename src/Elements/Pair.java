package Elements;

import java.io.Serializable;

public class Pair implements Serializable {
    public User user0;

    public Pair(User user0, User user1) {
        this.user0 = user0;
        this.user1 = user1;
    }

    public User user1;
}
