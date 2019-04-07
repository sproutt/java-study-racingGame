package model;

import java.util.List;

public class Car {

    private int position;

    public Car() {
        position = 0;
    }

    public void move() {
        position++;
    }

    public void submitRecord(List<Integer> record) {
        record.add(position);
    }
}