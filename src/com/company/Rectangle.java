package com.company;

public class Rectangle {
    private double side1;
    private double side2;

    public void areaCalculator(double num1, double num2){
        side1 = (num1 * num2);
    }
    public void perimeterCalculator(double num1, double num2){
        side2 = (num1 + num2)*2;
    }
    public void viewResult() {
        System.out.println("Площадь прямоугольника: " + side1);
        System.out.println("Периметра прямоугольника: " + side2);

    }
}
