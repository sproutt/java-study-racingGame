package RacingGame;

import java.util.Random;

public class Utils {
    private static final int Max_Boundary =10;
    public int randomGenerator() {
        Random random = new Random();
        return random.nextInt(Max_Boundary);
    }
}
