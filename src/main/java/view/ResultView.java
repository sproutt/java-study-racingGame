package view;

import model.Car;

public class ResultView {
    public static String POSITION_MARK = "-";

    public void printResult(Car[] cars){
        System.out.println("실행 결과");

        for(int i = 0; i < cars.length; i++){
            carPosition(cars[i]);
        }
    }

    public void carPosition(Car car){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < car.getPosition(); i++){
            stringBuilder.append(POSITION_MARK);
        }

        System.out.println(stringBuilder);
    }
}
