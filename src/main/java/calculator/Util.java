package calculator;

public class Util {
    public  String[] split(String element){
        if(isNull(element)){
            throw new RuntimeException();
        }
        return element.split(" ");
    }

    public String removeBlank(String element) {
        return element.replaceAll(" ", "");
    }

    public boolean isNull(String element) {
        boolean result = false;
        element = removeBlank(element);
        if (element.isEmpty()) {
            result = true;
        }
        return result;
    }
}
