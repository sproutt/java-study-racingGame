package dto;

public class CarDTO {

    private String name;
    private int distance;

    public CarDTO(String carName, int distance) {
        this.name = carName;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void drawCarTrack(String TRACK) {
        System.out.print(name);
        for (int i = 0; i < distance; i++) {
            System.out.print(TRACK);
        }
        System.out.println();
    }

}
