package com.econo.racingGame.controller;

import com.econo.racingGame.model.GameDB;

import java.util.Random;

public class RacingGameController {

    final static int MOVEBOUNDARY = 4;

    public GameDB makeResult(GameDB gameDB){
        for(int i = 0; i< gameDB.carPositions.length; i++){
            gameDB.carPositions[i] = individualResult(gameDB);
        }
        return gameDB;
    }

    public int individualResult(GameDB gameDB){
        int individualResult = 0;
        for(int i = 0; i< gameDB.tryNumber; i++){
            individualResult = individualResult + goStop();
        }
        return individualResult;
    }

    private int goStop(){
        Random random = new Random();
        int nowResult = random.nextInt(10);
        if(nowResult>=MOVEBOUNDARY){
            return 1;
        }
        return 0;
    }

}

