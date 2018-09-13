import oracle.jrockit.jfr.StringConstantPool;

import java.util.*;

public class Calculator {

    public int readExpression(String expression) {
        String[] expressionArray = expression.split(" ");
        int ans = Integer.parseInt(expressionArray[0]);
        for(int i = 0; i < expressionArray.length-2; i+=2){
            ans = calculate(ans, Integer.parseInt(expressionArray[i+2]), expressionArray[i+1]);
        }
        return ans;
    }

    private int calculate(int x, int y, String z) {
        int ans = 0 ;
        switch (z) {
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

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) {
        return a / b;
    }
}
