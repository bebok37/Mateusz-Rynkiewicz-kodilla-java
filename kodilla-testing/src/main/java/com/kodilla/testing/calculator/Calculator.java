package com.example.kalkulator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.add(5, 3);
        System.out.println("5 + 3 = " + result1);

        int result2 = calculator.subtract(10, 7);
        System.out.println("10 - 7 = " + result2);
    }
}