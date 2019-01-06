import java.util.Scanner;

public class Calculator {


    int sum(int a,int b){
        return a+b;
    }

    int subtract(int a, int b){
        return a-b;
    }

    int multiple(int a, int b){
        return a*b;
    }

    int divide(int a, int b){
        return a/b;
    }

    char[] makeArrayFunction(String function){
        char[] arrayFunction = new char[function.length()];
        for(int i = 0;i<function.length();i++){
            arrayFunction[i] = (function.charAt(i));
        }
        return arrayFunction;
    }

    int changeNumber(char alphabet){
        return (int)(alphabet-'0');
    }

    int matchFunction(char sign,int answer, int nextNumber){
        int nowAnswer = 0;
        if(sign == '+'){
            nowAnswer = sum(answer,nextNumber);
        }else if(sign == '-'){
            nowAnswer = subtract(answer,nextNumber);
        }else if(sign == '*'){
            nowAnswer = multiple(answer,nextNumber);
        }else if(sign == '/'){
            nowAnswer = divide(answer,nextNumber);
        }
        return nowAnswer;
    }

    int calculate(String function){
        char[] arrayFunction = makeArrayFunction(function);
        int answer = changeNumber(arrayFunction[0]);
        for(int i = 2;i+2<function.length();i = i+4){
           answer = matchFunction(arrayFunction[i],answer,changeNumber(arrayFunction[i+2]));
        }
        return answer;
    }



}