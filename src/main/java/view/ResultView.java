package view;

import model.Car;

public class ResultView {

    public static void result(){
        System.out.println("실행 결과");
    }

    public void carsPosition(Car[] cars){
        for(int i = 0; i < cars.length; i++){
            carPosition(cars[i]);
        }
    }

    public void carPosition(Car car){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < car.getPosition(); i++){
            sb.append("-");
        }

        System.out.println(sb);
    }
}
