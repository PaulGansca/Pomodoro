package com.teamtreehouse.pomodoro.model;

public enum AttemptKind {
    FOCUS(25 * 60, "Focus Time"),
    BREAK(5 * 60, "Break Time");

    private int totalSeconds;
    private String displayName;

    AttemptKind(int totalSeconds, String displayName) {
        this.totalSeconds = totalSeconds;
        this.displayName = displayName;
    }

    public int getTotalSeconds() {
        return totalSeconds;
    }

    public String getDisplayName() {
        return displayName;
    }
}
