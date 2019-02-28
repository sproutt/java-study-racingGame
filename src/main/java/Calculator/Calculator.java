package Calculator;

import java.util.Scanner;

public class Calculator {
    public int inputString() {
        Scanner scanner = new Scanner(System.in);
        String originalString = scanner.nextLine();
        String[] splitString = originalString.split(" ");
        int answer = Integer.parseInt(splitString[0]);
        for (int i = 1; i < splitString.length - 1; i += 2) {
            answer = calculateString(answer, splitString[i], Integer.parseInt(splitString[i + 1]));
        }
        return answer;
    }

    public int calculateString(int answer, String operand, int nextNum) {
        if (operand.equals("+")) {
            return add(answer, nextNum);
        }
        if (operand.equals("-")) {
            return minus(answer, nextNum);
        }
        if (operand.equals("*")) {
            return multiple(answer, nextNum);
        }
        if (operand.equals("/")) {
            return divide(answer, nextNum);
        }
        return inputString();
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiple(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

}
