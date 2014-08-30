package com.ea.nex.Models;

/**
 * Created by EricQiu on 8/29/2014.
 */
public class GameScoreDB {
    private String gameName;
    private String score;
    private long userId;

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
