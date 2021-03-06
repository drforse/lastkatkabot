package com.senderman.lastkatkabot.bnc;

import java.util.List;

public class BncGameState {
    private final long id;
    private final int length;
    private final List<BncResult> history;
    private final int attemptsLeft;
    private final long startTime;
    private final boolean isHexadecimal;

    public BncGameState(long id, int length, List<BncResult> history, int attemptsLeft, long startTime, boolean isHexadecimal) {
        this.id = id;
        this.length = length;
        this.history = history;
        this.attemptsLeft = attemptsLeft;
        this.startTime = startTime;
        this.isHexadecimal = isHexadecimal;
    }

    public long getId() {
        return id;
    }

    public int getLength() {
        return length;
    }

    public List<BncResult> getHistory() {
        return history;
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }

    public long getStartTime() {
        return startTime;
    }

    public boolean isHexadecimal() {
        return isHexadecimal;
    }
}
