package RacingGame.Util;

import RacingGame.Model.*;

import java.util.List;

public class ResultView {
    final String resultSign = "출력 결과";
    public void readCar(List<Car> carArray){
        System.out.println(resultSign);
        for (int i = 0; i < carArray.size() ; i++) {
            printCar(carArray.get(i).getCarPosition());
        }
    }
    public void printCar(int carPosition){
        for (int i = 0; i < carPosition; i++) {
            System.out.print('-');
        }
        System.out.println();
    }
}