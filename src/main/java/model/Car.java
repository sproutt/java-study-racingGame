package model;

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
        if (topRecord < position) {
            return position;
        }
        return topRecord;
    }

    public String getWinnerName(int topRecord) {
        if (isWin(topRecord)) {
            return name;
        }
        return null;
    }

    private String showTrack(char trackShape) {
        StringBuffer track = new StringBuffer();
        for (int i = 0; i < position; i++) {
            track.append(trackShape);
        }
        return track.toString();
    }

    public String showRecord(char trackShape, String blank) {
        StringBuffer sb = new StringBuffer();
        sb.append(name)
                .append(blank)
                .append(showTrack(trackShape));
        return sb.toString();
    }
}