import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Calculator {
    public String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private String[] splitOperand(String string) {
        return string.split(" ");
    }

    private int add(int i, int j) {
        return i + j;
    }

    private int subtract(int i, int j) {
        return i - j;
    }

    private int multiply(int i, int j) {
        return i * j;
    }

    private int divide(int i, int j) {
        if (i != 0 && j == 0) {
            System.out.println("0으로 나눌 수 없습니다!");
            throw new ArithmeticException();
        }
        return i / j;
    }

    private int calculate(int currentValue, char operator, int newValue) {
        if (operator == '+') {
            return add(currentValue, newValue);
        }
        if (operator == '-') {
            return subtract(currentValue, newValue);
        }
        if (operator == '*') {
            return multiply(currentValue, newValue);
        }
        if (operator == '/') {
            return divide(currentValue, newValue);
        }
        throw new RuntimeException();
    }

    private int calculateAll(String[] string) {
        int answer = parseInt(string[0]);
        for (int i = 0; i < string.length - 2; i += 2) {
            answer = calculate(answer, string[i + 1].charAt(0), parseInt(string[i + 2]));
        }
        return answer;
    }

    public int calculateAnswer(String input) {
        if (input.isEmpty()) {
            throw new RuntimeException();
        }
        return calculateAll(splitOperand(input));
    }

}

