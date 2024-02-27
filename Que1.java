//when we call any data member with static no need to use object


import java.util.Scanner;




public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");

        System.out.println("Enter A Number: ");
        float num = sc.nextFloat();
        showStat(num);


    }

    static void showStat(float num){

        if(num==0)
            System.out.println("Zero");
        if(num<1)
            System.out.println("Small");
        if(num>10000)
            System.out.println("Large");
        else if(num<0)
            System.out.println("Negative");
        else
            System.out.println("Positive");
    }


}