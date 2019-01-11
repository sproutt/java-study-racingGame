package com.econo.racingGame.view;

import java.util.Scanner;

import com.econo.racingGame.model.GameDB;

public class InputVIew {

    private static GameDB gameDB = new GameDB();

    public static GameDB setting() {
        carNumber();
        tryNumber();
        return gameDB;
    }

    private static void carNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇대인가요?");
        gameDB.carPositions = new int[scanner.nextInt()];
    }

    private static void tryNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("시도할 회수는 몇대인가요?");
        gameDB.tryNumber = scanner.nextInt();
    }

}
