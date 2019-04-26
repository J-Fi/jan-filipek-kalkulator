package com.kodilla.kodillacourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseApplication {

    public static void main(String[] args) {
        Calculator calc = new Calculator(4,3);
        double sum = calc.sum();
        double substr = calc.substract();

        System.out.println("Suma = " + sum + ", różnica = " + substr);
    }
}

class Calculator {

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