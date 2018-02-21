package com.swift.academy.excercise;

public class Circle extends Shape {
    final static double PI = 3.14;

    double r;

    Circle(double radius) {
        this.r = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*PI*r;
    }

    @Override
    public double getArea() {
        return PI*r*r;
    }
}
