public class Car {
    int numberOfGame = 0;
    int distance = 0;
    int from = 0;
    int to = 9;
    int standard = 4;

    Car(int numberOfGame_para) {
        numberOfGame = numberOfGame_para;
    }

    public boolean isWon() {
        double randomValue = Math.random();
        return ((int)(randomValue * to) + from >= standard) ? true : false;
    }

    public void Move(boolean isMoved) {
        if(isMoved) distance++;
    }

    public void showResults() {
        for (int i=0; i<distance; i++) {
            System.out.print("-");
        }
        System.out.println(" ");
    }

    public void doGame() {
        for (int i=0; i<numberOfGame; i++) {
            Move(isWon());
        }
        showResults();
    }
}
