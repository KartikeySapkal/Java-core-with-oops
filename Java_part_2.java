public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double a = 22;
        double b = 7;
        double div = a / b;
        System.out.println("a/b = " + div); //returns result upto 16 digits
        int c = 1;
        System.out.println(++c); //2 while c++ return 1;

        //random function in java

        System.out.println(Math.random()); //returns value within range this value is generally in long format
        System.out.println(Math.random() * 100); //random will genrally return any number from 0 t0 1
        System.out.println((int) (Math.random() * 100)); //type casting

        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            default:
                System.out.println("Any other day");
        }

    }
}
