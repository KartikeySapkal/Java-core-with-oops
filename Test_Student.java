//create a java program with two classes student and test student,
//student class has 3 prop namely id, fname, lname
//student class has constructor and printStudent method
//Constructor accepts all 3 prop and set them to object prop id, fname, lname
//print student method returns a string representation of the invoking student object
//with format ID : 25   First Name: Kartikey   Last Name: Sapkal

//the test_student class has main method that first prints program title and prompts user to enter
//name of n student,
//creates an array with name,
// prompts user to enter records for all students from standard input to the elements of student array
//and call the print student method to print the format

import java.util.Scanner;

class Student{

    int id;
    String fname;
    String lname;

    Student(int id, String fname, String lname){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    String printStudent(){
        return "ID : " + id + "   First Name: " + fname + "   Last Name: " + lname;
    }

}

public class Test_Student {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Students: ");
        int n = sc.nextInt();

        Student [] s1 = new Student[n];
        int id;
        String fname;
        String lname;
        for(int i=0; i<n; i++) {
            System.out.println("Enter Information for Student : "+ (i+1));
            System.out.println("Enter ID: ");
            id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter First Name: ");
            fname = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter Last Name: ");
            lname = sc.nextLine();
            sc.nextLine();
            s1[i] = new Student(id,fname,lname);
        }

        for(int i=0; i<n; i++) {
            System.out.println("Information for Student : " + (i + 1));
            System.out.println(s1[i].printStudent());

        }

    }
}