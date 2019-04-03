import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StringCalculator {
    public void main(String[] args) {
        makeResult(input());
    }

    public String input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public int makeResult(String input) {
        return calculate(operandList(splitBlank(input)), operatorList(splitBlank(input)));
    }

    public String[] splitBlank(String str) {
        return str.split(" ");
    }

    public Queue<Integer> operandList(String[] separatedString) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < separatedString.length; i++) {
            if (isOperand(separatedString[i])) {
                q.add(toInt(separatedString[i]));
            }
        }
        return q;
    }

    public Queue<Character> operatorList(String[] separatedString) {
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < separatedString.length; i++) {
            if (isOperator(separatedString[i])) {
                q.add(separatedString[i].charAt(0));
            }
        }
        return q;
    }

    public boolean isOperand(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!('0' <= str.charAt(i) && str.charAt(i) < '9')) return false;
        }
        return true;
    }

    public int toInt(String str) {
        return Integer.parseInt(str);
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

    public int calculate(Queue<Integer> operand, Queue<Character> operator) {
        int result = operand.poll();
        while (!operand.isEmpty()) {
            result = calculate(result, operator.poll(), operand.poll());
        }

        return result;
    }

    public int calculate(int firstValue, int operator, int secondValue) {
        switch (operator) {
            case '+':
                return add(firstValue, secondValue);
            case '-':
                return subtract(firstValue, secondValue);
            case '*':
                return multiply(firstValue, secondValue);
            case '/':
                return divide(firstValue, secondValue);
        }

        return -1;
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
