package calculator;

public class Calculator {
    Util util = new Util();

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

    public double progress(String inputLine) {
        String[] partitions = util.split(inputLine);
        double result = Double.parseDouble(partitions[0]);
        for (int i = 0; i < partitions.length-2; i += 2) {
            result = calculate(partitions[i + 1], result, Double.parseDouble(partitions[i + 2]));
        }
        return result;
    }
}
