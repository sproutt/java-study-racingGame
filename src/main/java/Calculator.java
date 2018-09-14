import java.util.Scanner;

public class Calculator {

    double number1 = 0, number2 = 0, result;
    String operator;
    String[] values;
    int index = 1;
    boolean error = false;

    public double add(double number1, double number2){ return number1 + number2; }
    public double subtract(double number1, double number2){ return number1 - number2; }
    public double multiply(double number1, double number2){ return number1 * number2; }
    public double divide(double number1, double number2){ return number1 / number2; }

    public void inputValue(){
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        values = value.split(" ");
        if(values.length < 3 ) {
            error = true;
            return;
        }
        result = Double.parseDouble(values[0]);
    }

    public void allocateValue(){
        number1 = result;
        operator = values[index];
        number2 = Double.parseDouble(values[index+1]);

    }

    public void operation(){
        switch (operator) {
            case "+":
                result = add(number1, number2);
                break;
            case "-":
                result = subtract(number1, number2);
                break;
            case "*":
                result = multiply(number1, number2);
                break;
            case "/":
                result = divide(number1, number2);
                break;
            default:
                error = true;
                break;
        }
    }

    public double calculation(){
        inputValue();
        while(index + 1 < values.length) {
            allocateValue();
            index += 2;
            operation();
        }
        if(error == true) {
            System.out.println("올바르지 않은 입력입니다");
            return 0;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Calculator().calculation());
    }
}