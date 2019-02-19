public class Calculator {
    public double add(double leftNumber, double rightNumber) {
        return leftNumber + rightNumber;
    }

    public double substract(double leftNumber, double rightNumber) {
        return leftNumber - rightNumber;
    }

    public double divide(double leftNumber, double rightNumber) {
        return leftNumber / rightNumber;
    }

    public double multiply(double leftNumber, double rightNumber) {
        return leftNumber * rightNumber;
    }

    private double selectOperating(String operator, double leftNumber, double rightNumber) {
        double result = 0;
        if (operator.equals("+")) {
            result = add(leftNumber, rightNumber);
        }
        if (operator.equals("-")) {
            result = substract(leftNumber, rightNumber);
        }
        if (operator.equals("*")) {
            result = multiply(leftNumber, rightNumber);
        }
        if (operator.equals("/")) {
            result = divide(leftNumber, rightNumber);
        }
        return result;
    }

    public boolean checkError(String[] element) {
        boolean result = false;
        if (element.length == 0) return true;
        for (int i = 0; i < element.length; i++) {
            result = result || element[i].isEmpty();
        }
        return result;
    }

    private String[] plotNumber(String inputLine) {
        return inputLine.split("[+/*-]");
    }

    private String[] plotOperator(String inputLine) {
        inputLine = inputLine.replaceAll("[0-9]", "");
        return inputLine.split("");
    }

    private String typeConvert(double convertingNumber) {
        if (convertingNumber == (long) convertingNumber) {
            long convertedNumber = (long) convertingNumber;
            return Long.toString(convertedNumber);
        }
        return Double.toString(convertingNumber);
    }

    public double multipleCalculation(String inputLine) {
        inputLine = inputLine.replaceAll(" ", "");
        String[] plotedNumber = plotNumber(inputLine);
        String[] plotedOperator = plotOperator(inputLine);
        double result = Double.parseDouble(plotedNumber[0]);
        for (int i = 0; i < plotedOperator.length; i++) {
            result = selectOperating(plotedOperator[i], result, Double.parseDouble(plotedNumber[i + 1]));
        }
        return result;
    }
}