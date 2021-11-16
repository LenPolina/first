package Swap;

public class Main {
    public static void main(String[] args) {
        int[] result = new int[2];
        Swap swap = new Swap();
        result = swap.swap(3, 5);
        System.out.println(result[0] + " " + result[1]);
        System.out.println(Integer.MIN_VALUE*-1);
    }
}
