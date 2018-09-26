import java.util.Random;

public class LogicController {
    private Car car[];
    private InputView inputView;
    private ResultView resultView;

    public LogicController(Car car[], InputView inputView, ResultView resultView){
        this.car = car;
        this.inputView = inputView;
        this.resultView = resultView;
    }

    public int forwardOrStay(){
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        if(randomNumber>=4)
            return 1;
        return 0;
    }
    public int totalMove(int repeatTimes){
        int totalMovement=0;
        for(int i=0;i<repeatTimes;i++) totalMovement += forwardOrStay();

        return totalMovement;
    }
    public void printMovement(Car car[]){
        for(int i=0;i<car.length;i++){
            printEachCarMovement(car[i]);
        }
    }
    public void printEachCarMovement(Car car){
        for(int i=0; i<car.getForwardCounts();i++){
            System.out.print("-");
        }
        System.out.println();
    }
}


