package racingGame.model;

public class GameResultDto {

    private String[] winners;
    private int maxDistance;

    public String[] getWinners() {
        return winners;
    }

    public void setWinners(String[] winners) {
        this.winners = winners;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
