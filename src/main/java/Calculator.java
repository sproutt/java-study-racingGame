import java.util.Scanner;

public class Calculator {
    public static final int infinite = 999999;

    public int add(int i, int j) {
        return i + j;
    }

    public int subtract(int i, int j) {
        return i - j;
    }

    public int multiple(int i, int j) {
        return i * j;
    }

    public int divide(int i, int j) {
        return i / j;
    }

    public String getValue() {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        return value;
    }

    public String[] splitString(String value){
        String[] values = value.split(" ");
        return values;
    }

    public int calculate(int before, String operator, int after) {
        int result = infinite;
        if (operator.equals("+")) result = add(before, after);
        if (operator.equals("-")) result = subtract(before, after);
        if (operator.equals("/") || operator.equals("%")) result = divide(before, after);
        if (operator.equals("*")) result = multiple(before, after);
        return result;
    }

    public int devideString(String[] inputArr) {
        //System.out.println(before);
        int result = toInt(inputArr[0]);
        for(int i =0; i<inputArr.length-2; i+=2){
            result = calculate(result, inputArr[i+1], toInt(inputArr[i+2]));
        }
        return result;
    }

    public void print(int result) {
        if (result == infinite) System.out.println("잘못 입력하셨습니다");
        if (result != infinite) System.out.println("결과 : " + result);
    }

    public int toInt(String str){
        return Integer.parseInt(str);
    }
}