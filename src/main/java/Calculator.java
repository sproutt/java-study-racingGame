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
        int before = infinite;
        String operator = "";
        int after = infinite;
        for (int i = 0; i < inputArr.length; i++) {
            //System.out.println("" + before + ", " + operator + ", " + after);
            if (before == infinite) {
                before = Integer.parseInt(inputArr[i]);
                continue;
            }

            if (before != infinite && operator == "") {
                operator = inputArr[i];
                continue;
            }

            if (before != infinite && operator != "" && after == infinite) {
                after = Integer.parseInt(inputArr[i]);
                //System.out.println("계산 : " + before + operator + after );
                before = calculate(before, operator, after);
                //System.out.println("계산 값 : "+before);
                operator = "";
                after = infinite;
                continue;
            }

        }
        //System.out.println(before);
        return before;
    }

    public void print(int result) {
        if (result == infinite) System.out.println("잘못 입력하셨습니다");
        if (result != infinite) System.out.println("결과 : " + result);
    }
}