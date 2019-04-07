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

    public String showTrack(char trackShape) {
        StringBuffer track = new StringBuffer();
        for(int i=0; i<position; i++) {
            track.append(trackShape);
        }
        return track.toString();
    }
}