package Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(n + " - ое число фибоначчи = " + fibonacci.findFibonacciByNumber(n));
    }
}
