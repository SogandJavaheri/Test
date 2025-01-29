package com.github.sogandjavaheri.Test.ProfessorInfo;

public class ProfessorInfoTest {


    public static void main(String[] args) {

        ProfessorInfo prof1 = new ProfessorInfo();
        prof1.firstName = "Ali";
        prof1.lastName = "Shadan";
        prof1.age = 40;
        prof1.gender = "Male";
        prof1.ID = 123456789;

        System.out.println(prof1.ID);
        System.out.println(prof1.firstName);
        System.out.println(prof1.lastName);
        System.out.println(prof1.gender);
        System.out.println(prof1.age);
    }
}
