import java.util.Scanner;
public class Main{

    public static void printjava(){
        System.out.println("hello java");
    }


    public static void main(String[] args){
        int[] Marks = {97,94,95};
//        System.out.println(Marks[5]);
//        ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        try {
            System.out.println(Marks[5]);
        } catch(Exception exception) {
            System.out.println("Exception Encountered");
        }

        //functions in java
        printjava();
    }
}