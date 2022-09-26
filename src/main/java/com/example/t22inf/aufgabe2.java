package com.example.t22inf;

public class aufgabe2 {
    public static double maximum(double a,double b) {
        double result = Math.max(a,b);
        return result;
    }

    public static int faculty(int number) {
        if (number == 1){
            return number;
        } else{
            return number * faculty(number - 1);
        }

    }
}
