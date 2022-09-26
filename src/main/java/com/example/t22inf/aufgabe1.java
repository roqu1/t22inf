package com.example.t22inf;

import java.util.ArrayList;
import java.util.Scanner;

public class aufgabe1 {
    public static void main(String[] args) {
        //aufgabe 1 a
        System.out.println("Hello World!");
        //aufgabe 1 b
        Scanner mytext = new Scanner(System.in);
        System.out.println("Your name?");
        String name = mytext.nextLine();
        System.out.println("Hello " +name);
        //aufgabe 1 c
        ArrayList<String> liste = new ArrayList<>();
        String matrix = "WHATISTHEMATRIX";
        for (int i = 0;i<matrix.length();i+=3) {
            liste.add(matrix.substring(i,i+3));
        }
        for (String s:liste) {
            System.out.println(s);
        }


        // Aufgabe 2a
        System.out.println("Your first number?");
        double a = Double.parseDouble(mytext.nextLine());
        System.out.println("Your second number?");
        double b = Double.parseDouble(mytext.nextLine());
        double result = aufgabe2.maximum(a,b);
        System.out.println("The maximal number is "+result);

        //Aufgabe 2b
        System.out.println("Your factory number?");
        int number = Integer.parseInt(mytext.nextLine());
        int result2 = aufgabe2.faculty(number);
        System.out.println("The Factory of "+number+" is = "+result2);

        //Aufgabe 3b
        System.out.println("Width of the rectangle?");
        double width = Double.parseDouble(mytext.nextLine());
        System.out.println("Length of the rectangle?");
        double length = Double.parseDouble(mytext.nextLine());
        double circumference = Rectangle.calcCircumference(width,length);
        System.out.println("The Circumference of Rectangle is "+circumference);
        double area = Rectangle.calcArea(width,length);
        System.out.println("The Area of Rectangle is "+area);



    }
}
