package com.econo.racingGame.view;

import java.util.Scanner;

import com.econo.racingGame.model.GameDB;

public class InputVIew {

    public static int carNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇대인가요?");
        int carNumber = scanner.nextInt();
        return carNumber;
    }

    public static int tryNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("시도할 회수는 몇대인가요?");
        int tryNumber = scanner.nextInt();
        return tryNumber;
    }

}
