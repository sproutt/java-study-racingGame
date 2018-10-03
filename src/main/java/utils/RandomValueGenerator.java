package utils;

        import java.util.Random;

public class RandomValueGenerator {
    public int returnRandomInt() {
        Random random = new Random();
        return random.nextInt(10);
    }

}
