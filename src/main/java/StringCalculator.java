import java.util.Scanner;

public class StringCalculator {
    public static int calculateOperandCount(int[] array){
        int operandCount = 0 ;
        for(int i = 0 ; i < array.length ; i++ ){
            if(!(array[i]>=48 && array[i]<=57)){
                operandCount++;
            }
        }
        return operandCount;
    }
    public static int calculateNumberCount(int operandCount){
        return operandCount+1;
    }
    public static int makeAnswer(int[] numberArray,int[] operandArray){
        int tempAnswer = numberArray[0];
        for(int i = 0 ; i < operandArray.length ; i++){
            if(operandArray[i] == '+'){
                tempAnswer += numberArray[i+1];
            }
            else if(operandArray[i] == '-'){
                tempAnswer -= numberArray[i+1];
            }
            else if(operandArray[i] == '*'){
                tempAnswer *= numberArray[i+1];
            }
            else if(operandArray[i] == '/') {
                tempAnswer /= numberArray[i + 1];
            }
        }
        return tempAnswer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originString = scanner.nextLine();
        originString = originString.replace(" ","");
        int[] array = new int[originString.length()];
        for(int i = 0 ; i < originString.length() ; i++){
            array[i] = originString.charAt(i);
        }

        int[] numberArray = new int[calculateNumberCount(calculateOperandCount(array))];
        int[] operandArray = new int[calculateOperandCount(array)];
        int numberArrayIndex = 0;
        int operandArrayIndex = 0;
        int tempNum = 0;
        //
        for(int i = 0 ; i < array.length ; i++){
            if(i ==array.length-1){
                tempNum *= 10;
                numberArray[numberArrayIndex] = tempNum+array[i]-48;
            }
            else{
                if(array[i]>=48 && array[i]<=57){
                    tempNum *= 10;
                    tempNum += array[i]-48;
                }
                else{
                    operandArray[operandArrayIndex] = array[i];
                    numberArray[numberArrayIndex] = tempNum;
                    tempNum=0;
                    numberArrayIndex++;
                    operandArrayIndex++;
                }
            }
        }
        System.out.println(makeAnswer(numberArray,operandArray));
    }
}
