public class Calculator {
    public double add(String leftNumber, String rightNmber){
        return Double.parseDouble(leftNumber) + Double.parseDouble(rightNmber);
    }
    public double substract(String leftNumber, String rightNmber){
        return Double.parseDouble(leftNumber) - Double.parseDouble(rightNmber);
    }
    public double divide(String leftNumber, String rightNmber){
        return Double.parseDouble(leftNumber) / Double.parseDouble(rightNmber);
    }
    public double multiply(String leftNumber, String rightNmber){
        return Double.parseDouble(leftNumber) * Double.parseDouble(rightNmber);
    }

    private void selectOperating(String operator, String leftNumber, String rightNumber){
        if(operator.equals("+")){
            add(leftNumber,rightNumber);
        }
        if(operator.equals("-")){
            substract(leftNumber,rightNumber);
        }
        if(operator.equals("*")){
            divide(leftNumber,rightNumber);
        }
        if(operator.equals("/")){
            multiply(leftNumber,rightNumber);
        }
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

    public String calculates(String inputLine){
        String[] plotedNumber = plotNumber(inputLine);
        String[] plotedOperator = plotOperator(inputLine);

    }
}