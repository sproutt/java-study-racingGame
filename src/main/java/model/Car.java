package model;

import java.util.List;

public class Car {

    private int position;
    private String name;

    public Car(String name) {
        position = 0;
        this.name = name;
    }

    public void move() {
        position++;
    }

    private boolean isWin(int topRecord) {
        if (topRecord == position)
            return true;
        return false;
    }

    public int checkTopRecord(int topRecord) {
        return Math.max(topRecord, position);
    }

    public void addWinner(List<String> winners, int topRecord) {
        if (isWin(topRecord)) {
            winners.add(name);
        }
    }

    private String showTrack(char trackShape) {
        StringBuffer track = new StringBuffer();
        for (int i = 0; i < position; i++) {
            track.append(trackShape);
        }
        return track.toString();
    }

    public String showRecord(char trackShape, String blank) {
        StringBuffer record = new StringBuffer();
        record.append(name)
                .append(blank)
                .append(showTrack(trackShape));
        return record.toString();
    }
}