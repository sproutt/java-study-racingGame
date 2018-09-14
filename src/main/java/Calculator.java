import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Calculator{

    public int add(int a, int b) {return  a+b;}
    public int subtract(int a, int b) {return  a-b;}
    public int multiply(int a, int b) {return  a*b;}
    public int divide(int a, int b) {return  a/b;}

    public int calculate(int result, int operand, String operator)
    {
        switch (operator)
        {
            case "+":
            result = add(result,operand);
            break;

            case "-":
            result = subtract(result,operand);
            break;

            case "*":
            result = multiply(result,operand);
            break;

            case "/":
            result = divide(result,operand);
            break;

            default:
            System.out.println("unsupported operator:" + operator);

        }
            return result;
    }


    public void init(){

        Calculator cal = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] value =  input.split(" ");

        int result = parseInt(value[0]);

        for(int i = 1;i<value.length; i = i+2)
        {
            String operator = value[i];
            int operand =parseInt(value[i+1]);

            result = cal.calculate(result,operand, operator);
        }

    }

}