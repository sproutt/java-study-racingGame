package calculator;

import java.util.Scanner;

public class Calculator {
    private static final int INFINITE = 999999;

    public int add(int i, int j) {
        return i + j;
    }

    public int subtract(int i, int j) {
        return i - j;
    }

    public int multiple(int i, int j) {
        return i * j;
    }

    public int divide(int i, int j) {
        return i / j;
    }

    public String getValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String[] splitString(String value){
        String[] values = value.split(" ");
        return values;
    }

    public int calculate(int before, String operator, int after) {
        int result = INFINITE;
        if (operator.equals("+")){
            result = add(before, after);
        }
        if (operator.equals("-")){
            result = subtract(before, after);
        }
        if (operator.equals("/") || operator.equals("%")){
            result = divide(before, after);
        }
        if (operator.equals("*")){
            result = multiple(before, after);
        }
        return result;
    }

    public int devideString(String[] inputArray) {
        int result = convertStringToInt(inputArray[0]);
        for(int i =0; i<inputArray.length-2; i+=2){
            result = calculate(result, inputArray[i+1], convertStringToInt(inputArray[i+2]));
        }
        return result;
    }

    public void print(int result) {
        if (result == INFINITE) System.out.println("잘못 입력하셨습니다");
        if (result != INFINITE) System.out.println("결과 : " + result);
    }

    public int convertStringToInt(String number){
        return Integer.parseInt(number);
    }
}