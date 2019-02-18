import java.util.regex.*;
public class Calculator {
    private int selectCalculate(char operator, int leftNumber, int rightNumber){
        int result = leftNumber;
        if(operator == '+'){
            result = result + rightNumber;
        }
        if(operator == '-'){
            result = result - rightNumber;
        }
        if(operator == '/'){
            result = result / rightNumber;
        }
        if(operator == '*'){
            result = result * rightNumber;
        }
        return result;
    }

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
