package com.github.sogandjavaheri.Test.ProfessorInfo;

public class ProfessorInfoNonStaticTest {

    public static void main(String[] args) {

        ProfessorInfoNonStatic prof1 = new ProfessorInfoNonStatic();
        prof1.firstName = "Ali";
        prof1.lastName = "Somer";
        prof1.age = 40;
        prof1.gender = "Male";
        prof1.ID = 123456789;

//        System.out.println(prof1.ID);
//        System.out.println(prof1.firstName);
//        System.out.println(prof1.lastName);
//        System.out.println(prof1.gender);
//        System.out.println(prof1.age);

        prof1.Presentations();
        prof1.Info();
        
    }
}

class ProfessorInfoNonStatic {

    String firstName;
    String lastName;
    int age;
    String gender;
    int ID;
    int present;



    public void Presentations(ProfessorInfoNonStatic this) {

        System.out.println(this.firstName + this.lastName + "had" + this.present + "presntation.");

    }

    public void Info(ProfessorInfoNonStatic this) {

        System.out.println(this.firstName + this.lastName + "is" + this.age + "with ID No" + this.ID + ".");

    }

    public void AttendingThesisDefense() {

    }
}

