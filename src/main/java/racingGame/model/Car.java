package racingGame.model;

public class Car {
    private int carPosition = 0;
    private String playerName;
    private static int winnerPosition = 0;

    public void calculateWinnerPosition(){
        if(carPosition > winnerPosition){
            winnerPosition = carPosition;
        }
    }
    public boolean settingWinner(){
        if(this.carPosition == winnerPosition){
            return true;
        }
        return false;
    }

     public int getCarPosition() {
        return carPosition;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String[] names, int index) {
        this.playerName = names[index];
    }

    public void move() {
        carPosition++;
    }
}