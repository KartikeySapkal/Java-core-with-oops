//when we call any data member with static no need to use object

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");

        System.out.println("Enter A Number: ");
        float num = sc.nextFloat();
        gettable(num);


    }

    static void gettable(float num) {

        for (int i = 10; i >= 1; i--) {
            System.out.println(num + " x " + i + " = "+ num * i);
        }


    }
}