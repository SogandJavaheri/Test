package com.github.sogandjavaheri.Test.Circle;

public class CircleNonStaticTest {

    public static void main(String[] args) {


            CircleNonStatic circle1 = new CircleNonStatic();

            circle1.radius = 20;

            System.out.println(circle1.radius);

            circle1.area();
            circle1.perimeter();

        }
    }

class CircleNonStatic {


    double radius;
    static double pi = 3.14;


    public void perimeter(CircleNonStatic this){

        System.out.println("Perimeter of the circle is: " + this.radius*this.radius*pi);

    }

    public void area(CircleNonStatic this){

        System.out.println("Area of the circle is: " + 2*this.radius*pi);

    }
}