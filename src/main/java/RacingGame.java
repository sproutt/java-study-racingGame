import java.util.Random;
import java.util.Scanner;

public class RacingGame {
    private int cars;
    private int trys;
    private int[] carPositions;

    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        int cars = racingGame.getCarsNumber();
        int trys = racingGame.getTryNumber();

        racingGame.setCars(cars);
        racingGame.setTrys(trys);
        racingGame.initCarPisitions();
        System.out.println("실행 결과");
        for (int i = 0; i < trys; i++) {
            if (racingGame.tryMove()) {
                racingGame.moveAll();
                // 이 구문을 반복하는 메서드, 랜덤을 받아와서 4와 크기비교하는 메서드, 움직이는 메서드로 나눠서 적용하고싶으나
                // racingGame 객체를 다른 메서드 안에서 사용을 못한다는 점때문에 이렇게 적어두었습니다
                // 해결책이 필요합니다.
            }
        }
        racingGame.drawCars();
    }


    static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(10);
    }

    boolean tryMove() {
        boolean isMove = false;
        if (getRandomNumber() >= 4) {
            isMove = true;
        }
        return isMove;
    }

    public void moveAll() {
        // TO DO 구현
        for (int i = 0; i < carPositions.length; i++) {
            carPositions[i]++;
        }
    }


    public int getCars() {

        return cars;
    }

    public void setCars(int cars) {
        this.cars = cars;
    }

    public int getTrys() {
        return trys;
    }

    public void setTrys(int trys) {
        this.trys = trys;
    }

    void initCarPisitions() {
        carPositions = new int[cars];
    }
}
