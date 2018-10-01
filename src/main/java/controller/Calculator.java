package controller;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int calculate(int result, int operand, String operator) {
        switch (operator) {
            case "+":
                result = add(result, operand);
                break;

            case "-":
                result = subtract(result, operand);
                break;

            case "*":
                result = multiply(result, operand);
                break;

            case "/":
                result = divide(result, operand);
                break;

            default:
                System.out.println("unsupported operator:" + operator);
        }
        return result;
    }


    public String input() {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        return expression;
    }

    public int operate(String expression) {
        String[] token = expression.split(" ");

        int result = parseInt(token[0]);
        for (int i = 1; i < token.length; i = i + 2) {
            String operator = token[i];
            int operand = parseInt(token[i + 1]);
            result = calculate(result, operand, operator);
        }
        return result;
    }

    public static void main(String[] args) {
        Calculator stringCalculator = new Calculator();
        String expression = stringCalculator.input();
        int result = stringCalculator.operate(expression);
        System.out.println(result);
    }
}