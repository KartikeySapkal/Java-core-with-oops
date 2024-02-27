//when we call any data member with static no need to use object


import java.util.Scanner;




public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");

        System.out.println("Enter A Number: ");
        float num = sc.nextFloat();
        Factorial(num);


    }

    static void Factorial(float num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;

        }
        System.out.println("Factorial: "+ fact);


    }
}