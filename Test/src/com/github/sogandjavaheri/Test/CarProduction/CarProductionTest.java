package com.github.sogandjavaheri.Test.CarProduction;

public class CarProductionTest {

    public static void main(String[] args) {

        CarProduction car1 = new CarProduction();

        car1.model = "Ford";
        car1.color = "red";
        car1.plateNumber = 1234;

        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.plateNumber);
    }
}
