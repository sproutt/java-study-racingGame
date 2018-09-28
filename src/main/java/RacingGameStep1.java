import java.util.Scanner;

public class RacingGameStep1 {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        int numberOfCar = scanner.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요?");
        int numberOfGame = scanner.nextInt();

        System.out.println("\n실행 결과\n");
        
        Car[] cars = new Car[numberOfCar];
        for(int i=0; i < numberOfCar; i++) {
            cars[i] = new Car(numberOfGame);
            cars[i].doGame();
        }
    }
}
