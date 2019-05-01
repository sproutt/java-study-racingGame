package racinggame.model;

public class Car { //javajigi님의 코드를 보며 비교해 본 결과 내 Car클래스는 역할 분담이 부족한거 같다. 어디가 어떤 클래스의 역할인지 더 고민해보고 스크립트를 짜야 겠다.
    private int carPosition = 0;
    private String playerName;
    private static int winnerPosition = 0;

    public void calculateWinnerPosition() {
        if (carPosition > winnerPosition) {
            winnerPosition = carPosition;
        }
    }

    public boolean settingWinner() {
        if (this.carPosition == winnerPosition) {
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

    public static int getWinnerPosition() {
        return winnerPosition;
    }

    public void setPlayerName(String[] names, int index) {
        this.playerName = names[index];
    }

    public void move() {
        carPosition++;
    }
}