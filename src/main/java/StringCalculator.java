import java.util.Scanner;

public class StringCalculator {

    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().replace(" ", "");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiple(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int operands(int operandCount, int array) {
        if (!(array >= '0' && array <= '9')) {
            operandCount++;
        }
        return operandCount;
    }

    public static int operandCheckAndCalculate(int tempAnswer, int[] numberArray, int[] operandArray, int i) {
        if (operandArray[i] == '+') {
            return add(tempAnswer, numberArray[i + 1]);
        }
        if (operandArray[i] == '-') {
            return minus(tempAnswer, numberArray[i + 1]);
        }
        if (operandArray[i] == '*') {
            return multiple(tempAnswer, numberArray[i + 1]);
        }
        if (operandArray[i] == '/') {
            return divide(tempAnswer, numberArray[i + 1]);
        }
        return tempAnswer;
    }

    public static int calculateOperandCount(int[] array) {
        int operandCount = 0;
        for (int i = 0; i < array.length; i++) {
            operandCount = operands(operandCount, array[i]);
        }
        return operandCount;
    }

    public static int makeAnswer(int[] numberArray, int[] operandArray) {
        int tempAnswer = numberArray[0];
        for (int i = 0; i < operandArray.length; i++) {
            tempAnswer = operandCheckAndCalculate(tempAnswer, numberArray, operandArray, i);
        }
        System.out.println(tempAnswer);
        return tempAnswer;
    }

    public static int[] makeStringToArray(String originString) {
        int[] array = new int[originString.length()];
        for (int i = 0; i < originString.length(); i++) {
            array[i] = originString.charAt(i);
        }
        return array;
    }

    public static void main(String[] args) {
        String originSentence = inputString();
        int[] array = makeStringToArray(originSentence);
        int[] numberArray = new int[calculateOperandCount(array) + 1];
        int[] operandArray = new int[calculateOperandCount(array)];

        for (int i = 0; i < array.length; i += 2) {
            numberArray[i / 2] = array[i] - '0';
        }
        for (int i = 1; i < array.length; i += 2) {
            operandArray[i / 2] = array[i];
        }
        makeAnswer(numberArray, operandArray);
    }
}
