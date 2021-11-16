package Nod;

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;
        int fourth = Integer.MIN_VALUE;
        System.out.println(numbers.findNodForFourNumbers(first, second, third, fourth));
    }
}
