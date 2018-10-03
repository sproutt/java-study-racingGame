import java.util.LinkedList;

public class Stringcalculator {
    String[] trimmingExpression(String expression) {
        String trimmedExpression[] = expression.split(" ");
        return trimmedExpression;
    }

    boolean checkOperand(String string) {
        int ascii = string.charAt(0);
        if (ascii >= 48 && ascii <= 57) {
            return true;
        }
        return false;
    }

    boolean checkOperator(String string) {
        if (string.charAt(0) == '+' || string.charAt(0) == '-' || string.charAt(0) == '*' || string.charAt(0) == '/') {
            return true;
        }
        return false;
    }

    LinkedList<Integer> separateReturnOperands(String trimmedExpression[]) {
        LinkedList<Integer> operands = new LinkedList<Integer>();
        for (int i = 0; i < trimmedExpression.length; i++) {
            if (checkOperand(trimmedExpression[i])) operands.add(Integer.parseInt(trimmedExpression[i]));
        }
        return operands;
    }

    LinkedList<Character> separateReturnOperations(String trimmedExpression[]) {
        LinkedList<Character> operations = new LinkedList<Character>();
        for (int i = 0; i < trimmedExpression.length; i++) {
            if (checkOperator(trimmedExpression[i])) operations.add(trimmedExpression[i].charAt(0));
        }
        return operations;
    }

    int calculate(LinkedList<Integer> operands, LinkedList<Character> operations) {
        while (!operations.isEmpty()) {
            operatorSelect(operations, operands);
        }
        return operands.pollFirst();
    }

    void operatorSelect(LinkedList<Character> operations, LinkedList<Integer> operands) {
        int first = operands.pollFirst();
        int second = operands.pollFirst();
        switch (operations.poll()) {
            case '+':
                operands.addFirst(add(first, second));
                break;
            case '-':
                operands.addFirst(subtract(first, second));
                break;
            case '*':
                operands.addFirst(multiply(first, second));
                break;
            case '/':
                operands.addFirst(divide(first, second));
                break;
        }
    }

    int add(int number1, int number2) {
        return number1 + number2;
    }

    int subtract(int number1, int number2) {
        return number1 - number2;
    }

    int multiply(int number1, int number2) {
        return number1 * number2;
    }

    int divide(int number1, int number2) {
        return number1 / number2;
    }
}
