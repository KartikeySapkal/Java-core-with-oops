//when we call any data member with static no need to use object
//Write a Java program to copy an array by iterating the array.
import java.util.Scanner;




public class Que7 {
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
        System.out.println("Enter Position to iNsert: ");
        int pos = sc.nextInt();
        insert(arr,pos,n);


    }

    static void insert(int [] arr, int pos, int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Key: ");
        int key = sc.nextInt();

        for(int i=n; i>=pos; i--) {
        arr[i+1] = arr[i];
        }
        arr[pos] = key;

        for(int i=0; i<=n; i++) System.out.println("Arr[] = " + arr[i]);

    }
}