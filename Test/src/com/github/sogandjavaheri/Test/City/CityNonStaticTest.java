package com.github.sogandjavaheri.Test.City;

public class CityNonStaticTest {

    public static void main(String[] args) {

        CityNonStatic city1 = new CityNonStatic();
        city1.name = "San Francisco";
        city1.code = 1;
        city1.population = 50000;
        city1.weather = "Sunny";

//        System.out.println(city1.name);
//        System.out.println(city1.code);
//        System.out.println(city1.population);
//        System.out.println(city1.weather);

        city1.GetName();
        System.out.println(city1.GetName());
        city1.CalculateWeather();
    }
}

class CityNonStatic {

    String name;
    int code;
    int population;
    String weather;


    public String GetName(CityNonStatic this){

        return this.name;

    }

    public void CalculateWeather(CityNonStatic this){

        String prediction = this.weather;
        System.out.println(prediction);

    }
}