//1. write a programm to print area and primeter by creating a class Triangle
//without any parameterised constructor
//2. With Parameterised constructor

import java.util.Scanner;
import java.lang.Math;

class Triangle{
    float s1, s2, s3;

    Scanner sc = new Scanner(System.in);

    void getparams(){
        System.out.println("Enter s1,s2,s3: ");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();

    }

    Triangle(){

    }

    Triangle(int s1,int s2, int s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    float Perimeter(){
        return s1+s2+s3;
    }
    float Area(){
        float s = Perimeter()/2;
        System.out.println("S =  " + s);
        float a = s*(s-s1)*(s-s2)*(s-s3);
        System.out.println("a =  " + a);
        return (float) Math.sqrt(a);
    }
}



public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Triangle t1 = new Triangle();
        t1.getparams();
        float perimeter = t1.Perimeter();
        System.out.println("Perimeter is: " + perimeter);
        float area = t1.Area();
        System.out.println("Area is: " + area);

        Triangle t2 = new Triangle(4,7,9);
        float p2 = t2.Perimeter();
        float a2 = t2.Area();
        System.out.println("Perimeter = " + p2);
        System.out.println("Area = " + a2);



    }
}