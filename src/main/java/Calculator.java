import java.util.Scanner;

public class Calculator {

    private static final int MINIMUM_VALUE_LENGTH = 3;

    public double add(double number1, double number2){ return number1 + number2; }
    public double subtract(double number1, double number2){ return number1 - number2; }
    public double multiply(double number1, double number2){ return number1 * number2; }
    public double divide(double number1, double number2){ return number1 / number2; }

    //식을 입력받음
    public String[] inputExpression() {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");
        if(elements.length < MINIMUM_VALUE_LENGTH) {
            throw new InputException();
        }
        return elements;
    }

    //연산자와 피연산자를 인수로 받아 한 번의 계산을 수행
    public double operate(Operand operand, String operator) {
        switch (operator) {
            case "+":
                return add(operand.number1, operand.number2);
            case "-":
                return subtract(operand.number1, operand.number2);
            case "*":
                return multiply(operand.number1, operand.number2);
            case "/":
                return divide(operand.number1, operand.number2);
            default:
                throw new InputException();
        }
    }

    //메인
    public static void main(String[] args) {
        double number1, number2, temp, result;
        String operator;
        Operand operand;
        Calculator calculator = new Calculator();
        String[] elements = calculator.inputExpression();

        //최초에 입력받은 식에서 한 번의 계산을 반복
        temp = Double.parseDouble(elements[0]);
        for (int index = 1; index + 1 < elements.length; index += 2) {
            number1 = temp;
            operator = elements[index];
            number2 = Double.parseDouble(elements[index+1]);
            operand = new Operand(number1, number2);
            temp = calculator.operate(operand, operator);
        }

        result = temp;
        System.out.println(result);
    }
}

//피연산자 두개를 가지는 클래스
class Operand {
    double number1, number2;

    Operand(double number1, double number2){
        this.number1 = number1;
        this.number2 = number2;
    }
}

//올바르지 않은 입력에 대한 사용자 정의 예외
class InputException extends RuntimeException{
    InputException(){
        super("올바르지 않은 입력입니다.");
    }
}