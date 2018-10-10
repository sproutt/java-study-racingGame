package view;

import model.RacingResult;

public class OutputView {
    public static void printOutput(RacingResult result) {
        System.out.println();
        System.out.println("실행 결과");
        for (int i = 0; i < result.getCars().length; i++) {
            System.out.print(result.getCars()[i].getRacer() + " : ");
            result.printMove(result.getCars()[i]);
            System.out.println();
        }
        System.out.println();
    }
}

