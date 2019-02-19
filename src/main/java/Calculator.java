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

    public String inputExpression() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public double multipleCalculation(String inputLine) {
        inputLine = inputLine.replaceAll(" ", "");
        String[] plotedNumber = plotNumber(inputLine);
        String[] plotedOperator = plotOperator(inputLine);
        if (checkError(plotedNumber)) {
            throw new ExpressionException();
        }
        double result = Double.parseDouble(plotedNumber[0]);
        for (int i = 0; i < plotedOperator.length; i++) {
            result = selectOperating(plotedOperator[i], result, Double.parseDouble(plotedNumber[i + 1]));
        }
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.multipleCalculation(calculator.inputExpression());
    }

}

class ExpressionException extends RuntimeException {
    ExpressionException() {
        super("입력이 올바르지 않습니다.");
    }
}