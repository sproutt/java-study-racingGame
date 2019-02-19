package calculator;

import java.util.Scanner;

public class View {
    public static String getExpression() {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        return inputLine;
    }
}
