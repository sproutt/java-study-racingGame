import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class StringCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        value = value.replace(" ","");

        ArrayList<String> numberList = new ArrayList<>();
        ArrayList<String> logicList = new ArrayList<>();

        String num = "";
        char c1, c2;
        for(int i =  0  ; i < value.length() -1 ; i++){
            c1 = value.charAt(i);
            c2 = value.charAt(i+1);

            if(Character.isDigit(c1)){
                num += c1;
                if(!Character.isDigit(c2)){
                    numberList.add(num);
                    num="";
                }
            }
            if(!Character.isDigit(c1)){
                logicList.add(String.valueOf(c1));
                if( i == value.length() -2){
                    numberList.add(String.valueOf(c2));
                }
            }
        }
        int[] numArray = new int[numberList.size()];
        for(int i = 0 ; i < numberList.size() ; i++){
            numArray[i] = Integer.parseInt(numberList.get(i));
        }
        for(int i = 0 ; i < logicList.size() ; i++){
            System.out.println(logicList.get(i));
        }

        int prev = numArray[0];
        for(int i = 0 ; i < logicList.size() ; i++){
            if(logicList.get(i) == "+"){
                prev = prev + numArray[i+1];
            }
            else if(logicList.get(i) == "-"){
                prev = prev - numArray[i+1];
            }
            else if(logicList.get(i) == "*"){
                prev = prev * numArray[i+1];
            }
            else if (logicList.get(i) == "/"){
                prev = prev / numArray[i+1];
            }
       }
        System.out.println(prev);
    }
}
