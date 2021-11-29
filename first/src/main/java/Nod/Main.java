package Nod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Numbers numbers = new Numbers();
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();
        int fourth = in.nextInt();
        System.out.println("НОД для " + first + " " + second + " " + third + " " + fourth + " = " + numbers.findNodForFourNumbers(first, second, third, fourth));
    }
}
