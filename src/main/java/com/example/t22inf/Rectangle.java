package com.example.t22inf;

public class Rectangle {

    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public static double calcCircumference(double width,double length) {
        double ergebnis = 2*width + 2*length;
        return ergebnis;
    }

    public static double calcArea(double width,double length) {
        double ergebnis = width*length;
        return ergebnis;
    }
}
