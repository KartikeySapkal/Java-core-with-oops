import java.util.Scanner;




public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");

        System.out.println("Enter 3 Numbers: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        getmax(a,b,c);


    }

    static void getmax(float a, float b, float c){
        if(a>b & a>c)
            System.out.println("Greatest of All: " + a);
        else if(b>a & b>c)
            System.out.println("Greatest of All: " + a);
        else
            System.out.println("Greatest of All: " + c);




    }
}