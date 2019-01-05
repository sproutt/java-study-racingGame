import java.util.Scanner;

public class Calculator {

    static Scanner sc = new Scanner(System.in);

    static int answer = 0;
    static boolean worng_input;

    static String function = "";
    static char[] array_word;

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getAnswer() {
        return this.answer;
    }

    public static void sum(int now) {
        answer = answer + now;
    }

    public static void sub(int now) {
        answer = answer - now;
    }

    public static void mul(int now) {
        answer = answer * now;
    }

    public static void div(int now) {
        answer = answer / now;
    }

    public static void takeInput(){
        function = sc.nextLine();
        if(function.equals("")) {
            throw new IllegalArgumentException("입력 없음");
        }
    }

    public static void makeArray(){
        array_word = new char[function.length()];
        for(int i = 0;i<function.length();i++){
            array_word[i] = (function.charAt(i));
        }
    }

    public static int changeNumber(char alphabet){
        return (int)(alphabet-'0');
    }

    public static void calculate(char sign, int now) {
        if (sign == '+') {
            sum(now);
        } else if (sign == '-') {
            sub(now);
        } else if (sign == '*') {
            mul(now);
        } else if (sign == '/') {
            div(now);
        }
    }

    public static void runFunction(){
        firstAnswer();
        for(int i = 2;i<array_word.length;i=i+4){
            calculate(array_word[i],changeNumber(array_word[i+2]));
        }
    }

    public static void printResult() {
        System.out.println(answer);
    }

    public static void firstAnswer() {
        if(function.length()>0) {
            answer = changeNumber(array_word[0]);
        }
    }

    public static void main(String[] args) {
        takeInput();
        makeArray();
        runFunction();
        printResult();
    }

}