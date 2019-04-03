package racingGame.model;

public class Car {
    private int carPosition = 0;
    private String playerName;

    public int getCarPosition() {
        return carPosition;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String inputPlayerName(String name) {
        playerName = name;
        return playerName;
    }

    public int move() {
        return carPosition++;
    }
}