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

    public String showTrack(char trackShape) {
        StringBuffer track = new StringBuffer();
        track.append(name);
        track.append(" : "); //수정
        for(int i=0; i<position; i++) {
            track.append(trackShape);
        }
        return track.toString();
    }

    private boolean isWin(int maxRecord){
        if(maxRecord==position)
            return true;
        return false;
    }

    public int checkTopScore(int maxRecord){
        if(maxRecord<position){
            return position;
        }
        return maxRecord;
    }

    public String getWinnerCarName(int maxRecord){
        if(isWin(maxRecord)){
            return name;
        }
        return null;
    }

}