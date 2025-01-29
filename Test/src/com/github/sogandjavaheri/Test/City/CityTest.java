package com.github.sogandjavaheri.Test.City;

public class CityTest {

    public static void main(String[] args) {

        City city1 = new City();
        city1.name = "San Francisco";
        city1.code = 1;
        city1.population = 50000;
        city1.weather = "Sunny";

        System.out.println(city1.name);
        System.out.println(city1.code);
        System.out.println(city1.population);
        System.out.println(city1.weather);
    }
}