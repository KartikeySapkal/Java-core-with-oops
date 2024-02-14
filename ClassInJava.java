import java.util.Scanner;
class Student{
    static int Roll_no;
    static String name;
    static String branch;

    static void getInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Roll_No: ");
        Roll_no = sc.nextInt();
        System.out.println("Enter Branch: ");
        branch = sc.nextLine();
    }

    static void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + Roll_no);
        System.out.println("Branch: " + branch);
    }


}

public class Main{

    public static void main(String [] args){
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number of Students: ");
        int n =  sc.nextInt();

        Student [] s = new Student [n];

        for(int i=0; i<n; i++) {
            System.out.println("For Student "+ i);
            s[i].getInfo();
        }
        for(int i=0; i<n; i++) {
            System.out.println("For Student "+ i);
            s[i].showInfo();
        }



    }

}
