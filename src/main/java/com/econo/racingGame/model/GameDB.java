package com.econo.racingGame.model;

public class GameDB {

    private int[] carPositions;
    private int tryNumber;

    public int[] getCarPositions() {
        return carPositions;
    }

    public void setCarPositions(int[] carPositions) {
        this.carPositions = carPositions;
    }

    public int getTryNumber() {
        return tryNumber;
    }

    public void setTryNumber(int tryNumber) {
        this.tryNumber = tryNumber;
    }

    public void makeCarPositions(int carNumbers) {
        carPositions = new int[carNumbers];
    }


}
