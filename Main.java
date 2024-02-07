import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("Pattern 2");

        for(int i=n; i>=0; i--) {
            for(int j=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }



    }
}