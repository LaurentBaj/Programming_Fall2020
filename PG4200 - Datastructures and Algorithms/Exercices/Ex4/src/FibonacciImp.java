package org.pg4200.ex04;

public class FibonacciImp implements Fibonacci{

    @Override
    public int compute(int n) throws IllegalArgumentException {

        if (n<0) {
            throw new IllegalArgumentException("n less than 0 not allowed");
        }

        if (n == 0 || n == 1) {
            return n;
        }

        return compute(n - 2) + compute(n - 1);
    }
}
