//when we call any data member with static no need to use object
//Write a Java program to copy an array by iterating the array.
import java.util.Scanner;




public class Que8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");

        int [] arr = new int[50];

        System.out.println("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        MinMax(arr,n);



    }

    static void MinMax(int [] arr, int n){

        int max = 0;
        int min = 10000000;

        for(int i=0; i<n; i++) {
            if (arr[i] > max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];

        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }


}