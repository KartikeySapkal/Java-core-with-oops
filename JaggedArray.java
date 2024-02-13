import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //jagged array
        int arr[][] = new int[3][];
                arr[0] = new int[4];
                arr[1] = new int[3];
                arr[2] = new int[2];
        //declaration done
        Scanner sc = new Scanner(System.in);

        //taking input
        for (int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

//        Showing output
        for (int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Arr[" + i + "][" + j + "] = " + arr[i][j]);
            }
            System.out.println("\n");
        }


    }
}
