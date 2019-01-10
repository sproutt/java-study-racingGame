import java.util.Random;

public class RacingGame {

    private RacingGameInput racingGameInput = new RacingGameInput();
    private RacingGameOutput racingGameOutput = new RacingGameOutput();

    public RacingGameTools makeResult(RacingGameTools racingGameTools){
        for(int i = 0;i<racingGameTools.carPositions.length;i++){
            racingGameTools.carPositions[i] = individualResult(racingGameTools);
        }
        return racingGameTools;
    }

    public int individualResult(RacingGameTools racingGameTools){
        int individualResult = 0;
        for(int i = 0;i<racingGameTools.tryNumber;i++){
            individualResult = individualResult + randomResult();
        }
        return individualResult;
    }

    private int randomResult(){
        Random random = new Random();
        int nowResult = random.nextInt();
        if(nowResult>=4){
            return 1;
        }
        return 0;
    }

    public void play(){
        racingGameOutput.printResult(makeResult(racingGameInput.setting()));
    }

}
