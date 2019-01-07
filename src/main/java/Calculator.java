public class Calculator {


    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiple(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public char[] makeArrayFunction(String function) {
        char[] arrayFunction = new char[function.length()];
        for (int i = 0; i < function.length(); i++) {
            arrayFunction[i] = (function.charAt(i));
        }
        return arrayFunction;
    }

    public int changeNumber(char alphabet) {
        return (int) (alphabet - '0');
    }

    public int matchFunction(char sign, int answer, int nextNumber) {
        int nowAnswer = 0;
        if (sign == '+') {
            nowAnswer = sum(answer, nextNumber);
        }
        if (sign == '-') {
            nowAnswer = subtract(answer, nextNumber);
        }
        if (sign == '*') {
            nowAnswer = multiple(answer, nextNumber);
        }
        if (sign == '/') {
            nowAnswer = divide(answer, nextNumber);
        }
        return nowAnswer;
    }

    public int calculate(String function) {
        char[] arrayFunction = makeArrayFunction(function);
        int answer = changeNumber(arrayFunction[0]);
        for (int i = 2; i + 2 < function.length(); i = i + 4) {
            answer = matchFunction(arrayFunction[i], answer, changeNumber(arrayFunction[i + 2]));
        }
        return answer;
    }


}