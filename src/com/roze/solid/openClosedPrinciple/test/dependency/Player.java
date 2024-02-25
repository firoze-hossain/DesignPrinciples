package com.roze.solid.openClosedPrinciple.test.dependency;

public class Player {
    public void startGame(CricketGame cricketGame) {//dependency
        cricketGame.doBatting();
    }

    CricketGame cricketGame() {
        //return new CricketGame();//any modification of dependency(API) class can break the dependent class
        return new CricketGame("ODI");
    }
}
