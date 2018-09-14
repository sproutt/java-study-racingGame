import java.util.LinkedList;
import java.util.Scanner;

public class Stringcalculator {


    static LinkedList<Integer> numList = new LinkedList<Integer>();
    static LinkedList<Character> opList = new LinkedList<Character>();

    static Scanner sc = new Scanner(System.in);
    static String starr[];
    static String str;
    static String num = "";



    static String inputString(){
        str = sc.nextLine();
        return str;
    }

    static char parseStringtoChar(String str){
        return str.charAt(0);
    }

    static void separateString(){
        for(int i=0;i<starr.length;i++) {
            System.out.println(starr[i]);
            char ch = parseStringtoChar(starr[i]);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                numList.add(Integer.parseInt(num));
                opList.add(ch);
                num = "";
                continue;
            }
            num += ch;
        }
    }


    static void calculation(){

        str = inputString();
        starr = str.split(" ");

        separateString();
        numList.add(Integer.parseInt(num));
        while(!opList.isEmpty()) {
            int first = numList.poll();
            int second = numList.poll();
            char op = opList.poll();

            if(op == '+') {
                numList.addFirst(first + second);
            } else if(op == '-') {
                numList.addFirst(first - second);
            } else if(op == '*') {
                numList.addFirst(first * second);
            } else if(op == '/') {
                numList.addFirst(first / second);
            }
        }

        printNumlist();
    }


    static void printNumlist(){
        System.out.println(numList.poll());
    }


    public static void main(String[] args) {
        new Stringcalculator().calculation();
    }
}
