public class Car {

    static final char HYPHEN = '-';
    private String progressBar;
    private int position;

    Car() {
        position = 0;
        progressBar="";
    }

    public void move() {
        position++;
        progressBar+=HYPHEN;
    }

    public String getProgressBar(){
        return progressBar;
    }
}
