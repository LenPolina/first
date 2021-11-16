package Fibonacci;

import java.math.BigInteger;

public class Fibonacci {

    public BigInteger findFibonacciByNumber(int n) {
        BigInteger fibonacciNumber = BigInteger.ZERO;
        if (n > 0) {
            if (n <= 2) fibonacciNumber = BigInteger.ONE;
            else {
                BigInteger first = BigInteger.ONE;
                BigInteger second = BigInteger.ONE;
                fibonacciNumber = BigInteger.ZERO;
                for (int i = 2; i < n; i++) {
                    fibonacciNumber = first.add(second);
                    first = second;
                    second = fibonacciNumber;
                }
            }
        }
        return fibonacciNumber;
    }
}
