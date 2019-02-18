import java.util.regex.*;
public class Calculator {
    private String[] plotInputNumber(String inputString){
        inputString = inputString.replaceAll(" ","");
        Pattern operatorPattern = Pattern.compile("[+*/-]");
        String[] plotedNumber = operatorPattern.split(inputString);
        return plotedNumber;
    }

    private String plotInputOperator(String inputString){
        inputString = inputString.replaceAll(" ","");
        String plotedOperator = inputString.replaceAll("[0-9]+","");
        return plotedOperator;
    }
}
