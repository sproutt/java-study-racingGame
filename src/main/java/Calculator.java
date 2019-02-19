import java.util.Scanner;

public class Calculator {
    private static final String INPUT_ERROR = "Blanks are not supported.";

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

    public double calculate(String operator, double leftNumber, double rightNumber) {
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

    public boolean isNull(String elements) {
        boolean result = false;
        elements = removeBlank(elements);
        if (elements == null || elements.isEmpty()) {
            result = true;
        }
        return result;
    }

    private String[] toNumber(String inputLine) {
        return inputLine.split("[+/*-]");
    }

    private String[] toOperator(String inputLine) {
        inputLine = inputLine.replaceAll("[0-9]", "");
        return inputLine.split("");
    }

    public String getExpression() {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        if (isNull(inputLine)) {
            return INPUT_ERROR;
        }
        return inputLine;
    }

    public String removeBlank(String inputLine) {
        return inputLine.replaceAll(" ", "");
    }

    public double progress(String inputLine) {
        inputLine = removeBlank(inputLine);
        String[] numbers = toNumber(inputLine);
        String[] operators = toOperator(inputLine);
        double result = Double.parseDouble(numbers[0]);
        for (int i = 0; i < operators.length; i++) {
            result = calculate(operators[i], result, Double.parseDouble(numbers[i + 1]));
        }
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.progress(calculator.getExpression());
    }

}
