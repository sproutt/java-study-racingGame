import java.util.Scanner;

public class StringCalculator {

    public static String inputOriginalStringAndDeleteSpace() {
        Scanner scanner = new Scanner(System.in);
        String originString = scanner.nextLine();
        originString = originString.replace(" ", "");
        return originString;
    }

    public static int add(int a, int b) {
        a += b;
        return a;
    }

    public static int minus(int a, int b) {
        a -= b;
        return a;
    }

    public static int multiple(int a, int b) {
        a *= b;
        return a;
    }

    public static int divide(int a, int b) {
        a /= b;
        return a;
    }

    public static int operandCheck(int operandCount, int[] array, int i) {
        if (!(array[i] >= 48 && array[i] <= 57)) {
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
            operandCount = operandCheck(operandCount, array, i);
        }
        return operandCount;
    }

    public static int calculateNumberCount(int operandCount) {
        return operandCount + 1;
    }

    public static void makeAnswer(int[] numberArray, int[] operandArray) {
        int tempAnswer = numberArray[0];
        for (int i = 0; i < operandArray.length; i++) {
            tempAnswer = operandCheckAndCalculate(tempAnswer, numberArray, operandArray, i);
        }
        System.out.println(tempAnswer);
    }

    public static int[] makeStringToArray(String originString) {
        int[] array = new int[originString.length()];
        for (int i = 0; i < originString.length(); i++) {
            array[i] = originString.charAt(i);
        }
        return array;
    }


    public static int[] returnNumberArrayAndOperandArray(int[] array, int[] numberArray, int[] operandArray, boolean isNumberArray) {
        int numberArrayIndex = 0;
        int operandArrayIndex = 0;
        int tempNum = 0;
        for (int i = 0; i < array.length; i++) {

            if (i == array.length - 1) {
                tempNum *= 10;
                numberArray[numberArrayIndex] = tempNum + array[i] - 48;
            }
            if (i != array.length - 1) {

                if (array[i] >= 48 && array[i] <= 57) {
                    tempNum *= 10;
                    tempNum += array[i] - 48;
                }
                if (!(array[i] >= 48 && array[i] <= 57)) {
                    operandArray[operandArrayIndex] = array[i];
                    numberArray[numberArrayIndex] = tempNum;
                    tempNum = 0;
                    numberArrayIndex++;
                    operandArrayIndex++;
                }
            }
        }
        return (isNumberArray ? numberArray : operandArray);
    }

    public static void main(String[] args) {
        String originString = inputOriginalStringAndDeleteSpace();
        int[] array = makeStringToArray(originString);

        int[] numberArray = new int[calculateNumberCount(calculateOperandCount(array))];
        int[] operandArray = new int[calculateOperandCount(array)];

        boolean isNumberArray = true;
        numberArray = returnNumberArrayAndOperandArray(array, numberArray, operandArray, isNumberArray);
        operandArray = returnNumberArrayAndOperandArray(array, numberArray, operandArray, !isNumberArray);

        makeAnswer(numberArray, operandArray);
    }
}
