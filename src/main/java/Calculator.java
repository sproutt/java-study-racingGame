public class Calculator {

    public int calculate(String expression) {
        String[] elements = expression.split(" ");
        int answer = parseInt(elements[0]);
        for (int i = 0; i < elements.length - 2; i += 2) {
            answer = operate(answer, parseInt(elements[i + 2]), elements[i + 1]);
        }
        return answer;
    }

    public int operate(int x, int y, String operator) {
        switch (operator) {
            case "+":
                return add(x, y);
            case "-":
                return subtract(x, y);
            case "*":
                return multiply(x, y);
            case "/":
                return divide(x, y);
        }

        return 0;
    }

    public int parseInt(String element){
        return Integer.parseInt(element);
    }

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
}
