package com.econo.racingGame.view;

import com.econo.racingGame.model.Car;

public class ResultView {

    private static final char BAR = '-';

    public static void printResult(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            printBar(cars[i].getMoveDistance());
        }
    }

    private static void printBar(int distance){
        for(int i = 0;i<distance;i++){
            System.out.print(BAR);
        }
        System.out.println("");
    }

}