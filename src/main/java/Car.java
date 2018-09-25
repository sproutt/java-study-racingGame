public class Car {
    private int time;
    private int[] carPositions;

    public void setTime(int time) {
        this.time = time;
    }

    public void makeCarPositions(int numberOfCar){
        this.carPositions = new int[numberOfCar];
    }

    public void setCarPositions(int[] carPositions) {
        this.carPositions = carPositions;
    }

    public int getTime() {
        return time;
    }

    public int[] getCarPositions() {
        return carPositions;
    }
}
