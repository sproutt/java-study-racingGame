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

    private String showTrack(char trackShape) {
        StringBuffer track = new StringBuffer();
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

    public int checkTopRecord(int maxRecord){
        if(maxRecord<position){
            return position;
        }
        return maxRecord;
    }
    public String showRecord(char hypen, String blank){
        StringBuffer sb = new StringBuffer();
        sb.append(name); sb.append(blank);
        sb.append(showTrack(hypen));
        return sb.toString();
    }

    public String getWinnerName(int maxRecord){
        if(isWin(maxRecord)){
            return name;
        }
        return null;
    }

}