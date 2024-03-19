//Create an abstract class “Employee” with abstract methods “calculateSalary()” and “displayEmployeeDetails()”. Implement two subclasses “Manager” and “Worker” which extend “Employee” and implement the abstract methods. Create a “SalesPerson” class which extends “Manager” and overrides the necessary methods. Create objects of all classes and test their behavior.
import java.util.Scanner;


class Employee{

    String name;
    int salary;
    int age;
    int workexp;

    Scanner sc = new Scanner(System.in);

    void getdetail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of Employee: ");
        name = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Age: ");
        age = sc.nextInt();
        System.out.println("Enter Work Exp: ");
        workexp = sc.nextInt();
    }

    void calsal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Certifications: ");
        int cert = sc.nextInt();
        salary = workexp* 10000 + cert * 5000;
        System.out.println("Your Expected Salary: " + salary);

    }

    void showDetail(){

        System.out.println("Employee Name: "+ name);
        System.out.println("Age: " + age);
        System.out.println("Exp: " + workexp);
        System.out.println("Salary : " + salary);

    }

}





public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Employee e1 = new Employee();
        e1.getdetail();
        e1.calsal();
        e1.showDetail();



    }
}