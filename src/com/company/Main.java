package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину прямоугольника: ");
        double num1 = sc.nextDouble();
        System.out.println("Введите ширину прямоугольника: ");
        double num2 = sc.nextDouble();

        rec.perimeterCalculator(num1, num2);
        rec.areaCalculator(num1, num2);

        rec.viewResult();
    }
}
