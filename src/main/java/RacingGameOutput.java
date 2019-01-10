public class RacingGameOutput {


    public void printResult(RacingGameTools racingGameTools) {
        for(int i = 0; i< racingGameTools.carPositions.length; i++){
            printIndividual(racingGameTools.carPositions[i]);
        }
    }

    private void printIndividual(int position){
            for(int i = 0;i<position;i++){
                System.out.print('-');
            }
            System.out.println("");
    }

}
