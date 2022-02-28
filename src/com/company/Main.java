package com.company;

public class Main {

    public static void main(String[] args) {

        double num1 = 4.576689;

        double num2 = Math.round(num1);
        System.out.println(num2);

        double num3 = Math.round(num1 * 100) / 100.0;
        System.out.println(num3);

        double num4 = Math.round(num1 * 1000) / 1000.0;
        System.out.println(num4);

    }
}
