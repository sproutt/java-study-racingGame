import java.util.Scanner;

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

    public double selectOperating(String operator, double leftNumber, double rightNumber) {
        double result = -1;
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

    public boolean isNull(String elements) {
        boolean result = false;
        if (elements == null || elements.isEmpty()) {
            result = true;
        }
        return result;
    }

    private String[] splitNumber(String inputLine) {
        return inputLine.split("[+/*-]");
    }

    private String[] splitOperator(String inputLine) {
        inputLine = inputLine.replaceAll("[0-9]", "");
        return inputLine.split("");
    }

    public String getExpression() {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        inputLine = inputLine.replaceAll(" ", "");
        if (isNull(inputLine)) {
            return "-1";
        }
        return inputLine;
    }

    public double calculate(String inputLine) {
        String[] splitedNumber = splitNumber(inputLine);
        String[] splitedOperator = splitOperator(inputLine);
        double result = Double.parseDouble(splitedNumber[0]);
        for (int i = 0; i < splitedOperator.length; i++) {
            result = selectOperating(splitedOperator[i], result, Double.parseDouble(splitedNumber[i + 1]));
        }
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate(calculator.getExpression());
    }

}
