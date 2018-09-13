import java.util.Scanner;

public class Calculator {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] exp = sc.nextLine().split(" ");

    }

    private int add(int a, int b){
        return a+b;
    }

    private int subtract(int a, int b){
        return a-b;
    }

    private int multiply(int a, int b){
        return a*b;
    }

    private int divide(int a, int b){
        return a/b;
    }

}
