//make one class vehicle with 4 data members
//String name, int year, String model, String Color
//From this base class create a subclass car and motorcycle
//car will have Body Type and motorcycle have company

import java.util.Scanner;

class Vehicle{

    String name;
    String color;
    int year;
    String model;

    Scanner sc = new Scanner(System.in);

    Vehicle(){
        String name;
        String color;
        int year;
        String model;
        System.out.println("Enter Name of Vehicle: ");
        name = sc.nextLine();
        this.name = name;
        sc.nextLine();
        System.out.println("Enter Model of Vehicle: ");
        model = sc.nextLine();
        this.model = model;
        sc.nextLine();
        System.out.println("Enter Year of Manufacture: ");
        year = sc.nextInt();
        this.year = year;
        sc.nextLine();
        System.out.println("Enter Color of Vehicle: ");
        color = sc.nextLine();
        this.color = color;
        sc.nextLine();
    }
}

class Car extends Vehicle{
    String Body;
    Scanner sc = new Scanner(System.in);
    Car(){

        super();

        System.out.println("Enter Body Type: ");
        System.out.println("(SUV, Sedan, Hatchback, Coupe)");
        Body = sc.nextLine();
        sc.nextLine();

    }

    void Showdata(){

        System.out.println("Name : " + name);
        System.out.println("Color : "+ color);
        System.out.println("Year: " + year);
        System.out.println("Model : "+ model);
        System.out.println("Body Style : "+ Body);

    }


}


class MotorCycle extends Vehicle{
    Scanner sc = new Scanner(System.in);
    String company;
    MotorCycle(){

        super();

        System.out.println("Enter Company: ");
        company = sc.nextLine();
        sc.nextLine();

    }

    void Showdata(){

        System.out.println("Name : " + name);
        System.out.println("Color : "+ color);
        System.out.println("Year: " + year);
        System.out.println("Model : "+ model);
        System.out.println("Company : "+ company);

    }

}



public class Inheritance3 {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Car c1 = new Car();
        c1.Showdata();
        MotorCycle m1 = new MotorCycle();
        m1.Showdata();



    }
}