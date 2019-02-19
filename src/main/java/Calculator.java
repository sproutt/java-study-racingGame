public class Calculator {
    public String add(double leftNumber, double rightNumber){
        String[] check = {typeConvert(leftNumber),typeConvert(rightNumber)};
        if(checkError(check)) return "입력값이 올바르지 않습니다.";
        return typeConvert(leftNumber+rightNumber);
    }
    public String substract(double leftNumber, double rightNumber){
        String[] check = {typeConvert(leftNumber),typeConvert(rightNumber)};
        if(checkError(check)) return "입력값이 올바르지 않습니다.";
        return typeConvert(leftNumber+rightNumber);
    }
    public String divide(double leftNumber, double rightNumber){
        String[] check = {typeConvert(leftNumber),typeConvert(rightNumber)};
        if(checkError(check)) return "입력값이 올바르지 않습니다.";
        return typeConvert(leftNumber+rightNumber);
    }
    public String multiply(double leftNumber, double rightNumber){
        String[] check = {typeConvert(leftNumber),typeConvert(rightNumber)};
        if(checkError(check)) return "입력값이 올바르지 않습니다.";
        return typeConvert(leftNumber+rightNumber);
    }

    private String selectOperating(String operator, double leftNumber, double rightNumber){
        String result = null;
        if(operator.equals("+")){
            result = add(leftNumber,rightNumber);
        }
        if(operator.equals("-")){
            result = substract(leftNumber,rightNumber);
        }
        if(operator.equals("*")){
            result = divide(leftNumber,rightNumber);
        }
        if(operator.equals("/")){
            result = multiply(leftNumber,rightNumber);
        }
        return result;
    }
    private boolean checkError(String[] element){
        boolean result = false;
        if(element.length == 0) return true;
        for(int i = 0 ; i < element.length - 1 ; i++){
            result = result || element[i].isEmpty();
        }
        return  result;
    }

    private String[] plotNumber(String inputLine){
        inputLine = inputLine.replaceAll(" ","");
        return inputLine.split("[+/*-]");
    }

    private  String[] plotOperator(String inputLine){
        inputLine = inputLine.replaceAll(" ","");
        inputLine = inputLine.replaceAll("[0-9]","");
        return inputLine.split("");
    }

    private String typeConvert(double convertingNumber){
        if(convertingNumber == (long)convertingNumber){
            long convertedNumber = (long)convertingNumber;
            return Long.toString(convertedNumber);
        }
        return Double.toString(convertingNumber);
    }

    public String multipleCalculation(String inputLine){
        String[] plotedNumber = plotNumber(inputLine);
        String[] plotedOperator = plotOperator(inputLine);
        if(checkError(plotedNumber)) return "입력값이 올바르지 않습니다.";
        String result = plotedNumber[0];
        for(int i = 0; i < plotedOperator.length ; i++){
            result = selectOperating(plotedOperator[i],Double.parseDouble(result),Double.parseDouble(plotedNumber[i+1]));
        }
        return result;
    }
}