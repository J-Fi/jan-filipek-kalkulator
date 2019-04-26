package com.kodilla.kodillacourse;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator(4,3);
        double sum = calc.sum();
        double substr = calc.substract();

        System.out.println("Suma = " + sum + ", różnica = " + substr);
    }


    private double a;
    private double b;

    public Calculator (double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double sum() {
        return a + b;
    }

    public double substract() {
        return a - b;
    }

}

