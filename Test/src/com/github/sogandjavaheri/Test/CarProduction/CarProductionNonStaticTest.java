package com.github.sogandjavaheri.Test.CarProduction;

public class CarProductionNonStaticTest {

    public static void main(String[] args) {

        CarProductionNonStatic car1 = new CarProductionNonStatic();
        car1.model = "Pride";
        car1.color = "White";
        car1.plateNumber = 3456;
        car1.price = 200000000;

//        System.out.println(car1.model);
//        System.out.println(car1.color);
//        System.out.println(car1.plateNumber);

        car1.ProfitPercentage();
    }
}

class CarProductionNonStatic {

    String model;
    int plateNumber;
    String color;
    double price;



    public void ProfitPercentage(CarProductionNonStatic this){

        double profit = 0;
        profit += this.price;
        double percentage = profit * 100 / this.price;

        System.out.println(this.plateNumber + "\tprofit is: \t" + percentage);

    }

    public void LossPercentage(CarProductionNonStatic this){

    }
}