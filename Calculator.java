package org.example;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }
    public double add(String a, String b) {
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        return numA + numB;
    }

    public double substrction (double a, double b){
        return a - b;
    }
    public double multiplication(double a, double b) {
        return a * b;
    }
    public double division(double a, double b) {
        return a / b;
    }
}
