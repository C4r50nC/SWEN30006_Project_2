package oh_heaven.game;

import ch.aplu.jcardgame.*;
import ch.aplu.jgamegrid.*;
import java.awt.Color;
import java.awt.Font;
import java.util.*;
import java.util.stream.Collectors;

public class Player extends CardGame {
    private int score = 0;
    private int trick = 0;
    private int bid = 0;
    private boolean isHuman;
    private Actor scoreActor = null;

    Font bigFont = new Font("Serif", Font.BOLD, 36);

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
