import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Stringcalculator {


    //그냥 리스트로 구현하면 순차적으로가져오는 작업 부분의 소스가 너무 길고 추가적인 반복문도 필요하게 되어서 다시 linkedlist로 구현
     LinkedList<Integer> numbers = new LinkedList<Integer>();
     LinkedList<Character> operations = new LinkedList<Character>();
     String trimmedExpression[];
     String stringNumber = "";

    String[] trimmingExpression(String expression){
        trimmedExpression = expression.split(" ");
        return trimmedExpression;
    }

    char parseStringToCharacter(String string){
        return string.charAt(0);
    }

    //숫자 연산자 숫자 형태로 뽑아오는 함수
    void separateExpression(){
        for(int i=0;i<trimmedExpression.length;i++) {
            System.out.println(trimmedExpression[i]);
            char ch = parseStringToCharacter(trimmedExpression[i]);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                numbers.add(Integer.parseInt(stringNumber));
                operations.add(ch);
                stringNumber = "";
                continue;
            }
            stringNumber += ch;
        }
    }

    void calculation(){
        numbers.add(Integer.parseInt(stringNumber));
        while(!operations.isEmpty()) {
            int first = numbers.pollFirst();
            int second = numbers.pollFirst();

            switch(operations.poll()) {
                case '+':
                    System.out.println("first : " +first + " , second : " + second);
                    numbers.addFirst(first + second);
                    break;
                case '-':
                    numbers.addFirst(first - second);
                    break;
                case '*':
                    System.out.println("first : " +first + " , second : " + second);
                    numbers.addFirst(first * second);
                    break;
                case '/':
                    numbers.addFirst(first / second);
                    break;
            }
        }

    }

    int printAnswer(){
        return numbers.pollFirst();
    }

    public static void main(String[] args){

    }
}
