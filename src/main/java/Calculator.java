import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;
import sun.awt.SunHints;

import java.util.regex.*;
public class Calculator {
    private double selectCalculate(char operator, double leftNumber, double rightNumber){
        double result = leftNumber;
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

    private String typeConvert(double convertingNumber){
        if(convertingNumber == (long)convertingNumber){
            long convertedNumber = (long)convertingNumber;
            return Long.toString(convertedNumber);
        }
        return Double.toString(convertingNumber);
    }

    public String calculates(String inputString) throws Exception {
        try {
            if(inputString == null || inputString.isEmpty()){
                throw new Exception();
            }
            String[] inputNumber = plotInputNumber(inputString);
            String inputOperator = plotInputOperator(inputString);
            double middleResult = Double.parseDouble(inputNumber[0]);
            for (int i = 0; i < inputOperator.length(); i++) {
                middleResult = selectCalculate(inputOperator.charAt(i), middleResult, Double.parseDouble(inputNumber[i + 1]));
            }
            String result = typeConvert(middleResult)
            return result;
        }catch (Exception e){
            return "입력값이 없습니다.";
        }
    }
}
