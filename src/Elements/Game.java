package Elements;

import java.io.Serializable;

public class Game implements Serializable {
    public User[] players = new User[2];
    public User winner;
}
