import java.util.Scanner;

public class Calculator {
    public String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public String[] splitOperand(String str) {
        return str.split(" ");
    }

    public int Int(String str) {
        return Integer.parseInt(str);
    }

    public boolean isBlank(String input) {
        if (input.equals(" ") || input == null) {
            return true;
        }
        return false;
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
        try { return i / j; }
        catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다!");
        }
        return i / j;
    }

    public int calculate(int currentValue, char operator, int newValue) {
        if (operator == '+')
            return add(currentValue, newValue);
        if (operator == '-')
            return subtract(currentValue, newValue);
        if (operator == '*')
            return multiply(currentValue, newValue);
        if (operator == '/')
            return divide(currentValue, newValue);
        throw new RuntimeException();
    }

    public int calculateAll(String[] str) {
        int answer = Int(str[0]);
        for (int i = 0; i < str.length - 2; i+=2) {
            answer = calculate(answer, str[i+1].charAt(0), Int(str[i+2]));
        }
        return answer;
    }

    public int getAnswer(String input) {
        if (isBlank(input)) {
            throw new RuntimeException();
        }
        return calculateAll(splitOperand(input));
    }

}

