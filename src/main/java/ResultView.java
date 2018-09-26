public class ResultView {
    public void printResultLabel(){
        System.out.println("실행 결과");
    }
    public void printMovement(int totalMovement){
        for(int i=0;i<totalMovement;i++) System.out.print("-");
        System.out.println();
    }
}
