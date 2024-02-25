package com.roze.solid.openClosedPrinciple.test.dependency;

public class CricketGame {
    public void doBatting(){
        System.out.println("Player is batting");
    }
    String matchType;

    public CricketGame(String matchType) {
        this.matchType = matchType;
    }
}
