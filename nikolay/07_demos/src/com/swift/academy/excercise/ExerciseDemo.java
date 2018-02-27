package com.swift.academy.excercise;

/**
 * Created by Anatoli.
 */
public class ExerciseDemo {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle_1 = new Rectangle(1,2);
        Rectangle rectangle_2 = new Rectangle(2,2);
        Square square = new Square(2);
        Shape shape = new Shape();

        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println("-----------------------");
        System.out.println(rectangle_1.getPerimeter());
        System.out.println(rectangle_1.getArea());
        System.out.println("-----------------------");
        System.out.println(rectangle_2.getPerimeter());
        System.out.println(rectangle_2.getArea());
        System.out.println("-----------------------");
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
        System.out.println("-----------------------");
        System.out.println(shape.getPerimeter());
        System.out.println(shape.getArea());
    }
}
