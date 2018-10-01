package view;

import model.Car;

public class ResultView {
    private static final String POSITION_MARK = "-";

    public static void printResult(Car[] cars){
        System.out.println("실행 결과");

        for(int i = 0; i < cars.length; i++){
            carPosition(cars[i]);
        }
    }

    public static void carPosition(Car car){
        StringBuilder carPositionString = new StringBuilder();
        for(int i = 0; i < car.getPosition(); i++){
            carPositionString.append(POSITION_MARK);
        }

        System.out.println(carPositionString);
    }
}
