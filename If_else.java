import java.util.Scanner;

public class Main {
    static  char grade(int marks){
        if(marks>90)
            return 'A';
        else if(marks>70)
            return 'B';
        else if(marks>50)
            return 'C';
        else
            return 'F';
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your  Full Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Marks: '");
        int marks = sc.nextInt();

        System.out.println("Name: " + name + "\nMarks: "+ marks);
        System.out.println("Your Grade is: " + grade(marks));



    }
}
