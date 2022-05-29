package oh_heaven.game;

public class Player {
    private int score = 0;
    private int trick = 0;
    private int bid = 0;
    private boolean isHuman;

    public int getScore() {
        return score;
    }
    public int getTrick() {
        return trick;
    }
    public void addTrick() {
        trick += 1;
    }
    public int getBid() {
        return bid;
    }
    public void setBid(int bid) {
        this.bid = bid;
    }
    public boolean getIsHuman() {
        return isHuman;
    }
    public void resetTrick() {
        trick = 0;
    }
    public void addScore() {
        score += trick;
    }
    public void addScore(int bid) {
        score += bid;
    }

    public Player(boolean isHuman) {
        this.isHuman = isHuman;
    }
}
