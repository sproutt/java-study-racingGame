package stringclaculator;

import java.util.*;

public class StringCalculator {
    public ArrayList<String> operator;
    public ArrayList<String> number;


    public int add(int i, int j) {
        return i + j;
    }

    public int subtact(int i, int j) {
        return i - j;
    }

    public int multiply(int i, int j) {
        return i * j;
    }

    public int divide(int i, int j) {
        return i / j;
    }


    private ArrayList operation(String[] splitInput) {
        operator = new ArrayList<String>();
        for (int i = 0; i < splitInput.length; i++) {
            if (splitInput[i].equals("+") || splitInput[i].equals("-") || splitInput[i].equals("*") || splitInput[i].equals("/")) {
                operator.add(splitInput[i]);
            }
        }
        return operator;
    }


    private ArrayList numbers(String[] splitInput) {
        number = new ArrayList<String>();
        for (int i = 0; i < splitInput.length; i++) {
            if (!(splitInput[i].equals("+") || splitInput[i].equals("-") || splitInput[i].equals("*") || splitInput[i].equals("/"))) {
                number.add(splitInput[i]);
            }
        }
        return number;
    }

    public void calculator() {
        StringCalculator cal = new StringCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("식을 입력 : ");
        String input = scanner.nextLine();

        cal.answer(input);

    }

    public String[] inputsplit(String input) {
        String[] splitInput = new String[input.split(" ").length];

        for (int i = 0; i < input.split(" ").length; i++) {
            splitInput[i] = input.split(" ")[i];
        }

        return splitInput;
    }

    public int answer(String input) {
        StringCalculator cal = new StringCalculator();
        operator = cal.operation(cal.inputsplit(input));
        number = cal.numbers(cal.inputsplit(input));
        int result = Integer.parseInt(number.get(0));

        for (int i = 1; i < number.size(); i++) {
            if (operator.get(i - 1).equals("+")) {
                result = cal.add(result, Integer.parseInt(number.get(i)));
            }

            if (operator.get(i - 1).equals("-")) {
                result = cal.subtact(result, Integer.parseInt(number.get(i)));
            }

            if (operator.get(i - 1).equals("*")) {
                result = cal.multiply(result, Integer.parseInt(number.get(i)));
            }

            if (operator.get(i - 1).equals("/")) {
                result = cal.divide(result, Integer.parseInt(number.get(i)));
            }
        }
        return result;
    }
}
