package Swap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[] result;
        Swap swap = new Swap();
        result = swap.swap(a, b);
        System.out.println(a + " " + b + " after swap = " + result[0] + " " + result[1]);
    }
}
