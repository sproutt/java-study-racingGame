import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StringCalculator {

    public String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public boolean isBlank(String input) {
        if (input.equals(" ") || input == null)
            return true;
        return false;
    }

    public int makeResult(String input) {
        if (isBlank(input))
            throw new RuntimeException();
        return caculateQueue(operandQueue(splitBlank(input)), operatorQueue(splitBlank(input)));
    }

    public String[] splitBlank(String str) {
        return str.split(" ");
    }

    public Queue<Integer> operandQueue(String[] separatedString) {
        Queue<Integer> operandQueue = new LinkedList<>();
        for (int i = 0; i < separatedString.length; i++) {
            operandQueue = addOperandQueue(operandQueue, separatedString[i]);
        }
        return operandQueue;
    }

    public Queue<Character> operatorQueue(String[] separatedString) {
        Queue<Character> operatorQueue = new LinkedList<>();
        for (int i = 0; i < separatedString.length; i++) {
            operatorQueue = addOperatorQueue(operatorQueue, separatedString[i]);
        }
        return operatorQueue;
    }

    public Queue<Integer> addOperandQueue(Queue<Integer> operandQueue, String str) {
        if (isOperand(str)) {
            operandQueue.add(toInt(str));
        }
        return operandQueue;
    }

    public Queue<Character> addOperatorQueue(Queue<Character> operatorQueue, String str) {
        if (isOperator(str)) {
            operatorQueue.add(str.charAt(0));
        }
        return operatorQueue;
    }

    public boolean isOperand(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!('0' <= str.charAt(i) && str.charAt(i) < '9')) return false;
        }
        return true;
    }

    public boolean isOperator(String str) {
        if (str.length() != 1) {
            return false;
        }
        if (!(str.charAt(0) == '+' || str.charAt(0) == '-' || str.charAt(0) == '/' || str.charAt(0) == '*')) {
            return false;
        }
        return true;
    }

    public int toInt(String str) {
        return Integer.parseInt(str);
    }

    public int caculateQueue(Queue<Integer> operand, Queue<Character> operator) {
        int result = operand.poll();
        while (!operand.isEmpty()) {
            result = calculate(result, operator.poll(), operand.poll());
        }
        return result;
    }

    public int calculate(int firstValue, int operator, int secondValue) {
        if (operator == '+')
            return add(firstValue, secondValue);
        if (operator == '-')
            return subtract(firstValue, secondValue);
        if (operator == '*')
            return multiply(firstValue, secondValue);
        if (operator == '/')
            return divide(firstValue, secondValue);
        throw new RuntimeException();
    }

    public int add(int i, int j) {
        return i + j;
    }

    public int subtract(int i, int j) {
        return i - j;
    }

    public int multiply(int i, int j) {
        return i * j;
    }

    public int divide(int i, int j) {
        try {
            return i / j;
        } catch (ArithmeticException e) {
            System.out.println("숫자 0으로 나눌 수 없습니다.");
        }
        return i / j;
    }
}