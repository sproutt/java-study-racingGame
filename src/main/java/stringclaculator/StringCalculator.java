package stringclaculator;

import java.util.*;

public class StringCalculator {


    public int add(int i, int j) {
        return i + j;
    }

    public int subtact(int i, int j) {
        return i - j;
    }

    public int multiply(int i, int j) {
        return i * j;
    }

    public int divide(int i, int j) {
        return i / j;
    }

    public Queue<String> operation(String input) {
        String[] splitInput = new String[input.split(" ").length];
        Queue<String> operator = new Queue<String>() {
            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean offer(String s) {
                return false;
            }

            @Override
            public String remove() {
                return null;
            }

            @Override
            public String poll() {
                return null;
            }

            @Override
            public String element() {
                return null;
            }

            @Override
            public String peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        for (int i = 0; i < input.split(" ").length; i++) {
            splitInput[i] = input.split(" ")[i];
        }

        for (int i = 0; i < splitInput.length; i++) {
            if (splitInput[i].equals("+") || splitInput[i].equals("-") || splitInput[i].equals("*") || splitInput[i].equals("/")) {
                operator.add(splitInput[i]);
            }
        }

            return operator;
    }

    public Queue<Integer> numbers(String input) {
        String[] splitInput = new String[input.split(" ").length];
        Queue<Integer> number = new Queue<Integer>() {
            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean offer(Integer integer) {
                return false;
            }

            @Override
            public Integer remove() {
                return null;
            }

            @Override
            public Integer poll() {
                return null;
            }

            @Override
            public Integer element() {
                return null;
            }

            @Override
            public Integer peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        for (int i = 0; i < input.split(" ").length; i++) {
            splitInput[i] = input.split(" ")[i];
        }

        for (int i = 0; i < splitInput.length; i++) {
            if (!splitInput[i].equals("+") || !splitInput[i].equals("-") || !splitInput[i].equals("*") || !splitInput[i].equals("/")) {
                number.add(Integer.parseInt(splitInput[i])); // toString 문제인듯...
            }
        }

        return number;
    }

    public int answer(String input) {
        StringCalculator cal = new StringCalculator();
        int result = 0;
        Queue<String> operator = cal.operation(input);
        Queue<Integer> number = cal.numbers(input);

        while (number != null) {
            if (operator.poll().equals("+")) {
                result = cal.add(result, number.poll());
            }

            if (operator.poll().equals("-")) {
                result = cal.subtact(result, number.poll());
            }

            if (operator.poll().equals("*")) {
                result = cal.multiply(result, number.poll());
            }

            if (operator.poll().equals("/")) {
                result = cal.divide(result, number.poll());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("식을 입력 : ");
        String input = scanner.nextLine();
    }
}
