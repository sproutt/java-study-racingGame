import java.util.Random;

public class RacingGame {
    private int time;
    private int[] carPositions;

    public int[] move() {
        for (int i = 0; i < carPositions.length; i++) {
            carPositions[i] += FowardAndStop();
        }

        return carPositions;
    }

    public void oneTime() {

    }

    public int FowardAndStop() {
        Random random = new Random();
        int number = random.nextInt(10);
        if(number < 4) return 0;

        return 1;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void makeCarPositions(int numberOfCar){
        this.carPositions = new int[numberOfCar];
    }


}
