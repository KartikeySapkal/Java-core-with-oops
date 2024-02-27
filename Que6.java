//when we call any data member with static no need to use object
//Write a Java program to copy an array by iterating the array.
import java.util.Scanner;




public class Que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");

        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[ n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr1 = new int[ n];

        for(int i=0; i<n; i++) {
            arr1[i] = arr[i];
        }

        for(int i=0; i<n; i++){
            System.out.println("Arr1[] = " + arr1[i] );
        }



    }


}