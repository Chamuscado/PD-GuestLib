package Elements;

import java.io.Serializable;

public class Status implements Serializable {
    private User user;
    private int wins;
    private int defeats;

    public Status(User user, int wins, int defeats) {
        this.user = user;
        this.wins = wins;
        this.defeats = defeats;
    }

    public User getUser() {
        return user;
    }

    public int getWins() {
        return wins;
    }

    public int getDefeats() {
        return defeats;
    }
}
