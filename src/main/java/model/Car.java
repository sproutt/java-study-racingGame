package model;

public class Car {
    private int position;
    private String racer;

    public void setRacer(String name) {
        this.racer = name;
    }

    public String getRacer() {
        return racer;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }
}