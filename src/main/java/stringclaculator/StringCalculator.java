package stringclaculator;

import java.util.*;

public class StringCalculator {

    // 덧셈
    public int add(int i, int j) {
        return i + j;
    }

    // 뺄셈
    public int substract(int i, int j) {
        return i - j;
    }

    // 곱셈
    public int multiply(int i, int j) {
        return i * j;
    }

    // 나눗셈
    public int divide(int i, int j) {
        return i / j;
    }

    // 입력
    public String input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("식을 입력 : ");
        String input = scanner.nextLine();

        return input;
    }

    // 입력받은 식을 split
    public String[] splitExpression(String input) {
        String[] splits = new String[input.split(" ").length];

        for (int i = 0; i < input.split(" ").length; i++) {
            splits[i] = input.split(" ")[i];
        }

        return splits;
    }

    // 연산자를 담은 List 생성
    public List makeOperatorList(String[] splits) {
        List operatorList = new ArrayList();
        for (int i = 0; i < splits.length; i++) {
            if (splits[i].equals("+") || splits[i].equals("-") || splits[i].equals("*") || splits[i].equals("/")) {
                operatorList.add(splits[i]);
            }
        }
        return operatorList;
    }

    // 숫자를 담은 List 생성
    public List makeNumberList(String[] splitInput) {
        List numberList = new ArrayList();
        for (int i = 0; i < splitInput.length; i++) {
            if (!(splitInput[i].equals("+") || splitInput[i].equals("-") || splitInput[i].equals("*") || splitInput[i].equals("/"))) {
                numberList.add(splitInput[i]);
            }
        }
        return numberList;
    }

    // numberList와 operatorList의 원소들을 차례대로 꺼내 계산.
    public int calculate(String input) {
        StringCalculator cal = new StringCalculator();

        String[] splits = cal.splitExpression(input);

        List operatorList = cal.makeOperatorList(splits);
        List numberList = cal.makeNumberList(splits);

        int result = Integer.parseInt((String) numberList.get(0));

        for (int i = 1; i < numberList.size(); i++) {
            if (operatorList.get(i - 1).equals("+")) {
                result = cal.add(result, Integer.parseInt((String) numberList.get(i)));
            }

            if (operatorList.get(i - 1).equals("-")) {
                result = cal.substract(result, Integer.parseInt((String) numberList.get(i)));
            }

            if (operatorList.get(i - 1).equals("*")) {
                result = cal.multiply(result, Integer.parseInt((String) numberList.get(i)));
            }

            if (operatorList.get(i - 1).equals("/")) {
                result = cal.divide(result, Integer.parseInt((String) numberList.get(i)));
            }
        }
        return result;
    }
}
