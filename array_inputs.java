import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter Number of students: ");
        n = sc.nextInt();
        System.out.println("Enter marks: \n" +
                "for Student(1,2,3... )resp....");

         int[] Marks = new int[n];
         for(int i=0; i<n; i++) {
             System.out.print("For Student ");
             System.out.print(i+1 + ": ");
             Marks[i] = sc.nextInt();
         }
        for(int i=0; i<n; i++)
            if(Marks[i]>40) {
                System.out.print("Student "+ i+1 + ": ");
                System.out.println("Pass");
            }
            else {
                System.out.print("Student "+ i+1 + ": ");
                System.out.println("Failed");
            }
    }
}
