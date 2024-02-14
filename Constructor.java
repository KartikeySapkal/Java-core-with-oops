class Student{

    static String name;
    static int roll_no;
    static String Branch;
    Student(String name, int roll_no, String Branch){
        Student.name = name;
        Student.roll_no = roll_no;
        Student.Branch = Branch;
    }
    Student(){

    }

}

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Student s1  = new Student("Kartik",21,"Comp");

        System.out.println(s1.name);
        System.out.println(s1.roll_no);
        System.out.println(s1.Branch);

        Student s2 = new Student();

        s2.name = "Sachin";
        s2.roll_no = 222;
        s2.Branch = "Mechanical";

        System.out.println(s2.name);
        System.out.println(s2.roll_no);
        System.out.println(s2.Branch);

    }
}
