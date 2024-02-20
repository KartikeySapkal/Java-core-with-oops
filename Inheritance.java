import java.util.Scanner;

class Vehicle{ 
    int Wheels;
    int seats;

    
    
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of wheels: ");
        Wheels = sc.nextInt();
        System.out.println("Enter No of Seats: ");
        seats = sc.nextInt();
    }
    
}

class Bike extends Vehicle{
    String type;
    Scanner sc = new Scanner(System.in);
    @Override
    void getdata() {
        super.getdata();
        System.out.println("Enter Name of Bike: ");
        type = sc.next();
    }
    void showdata(){
        System.out.println("Wheels: " + super.Wheels);
        System.out.println("Seats: " + super.seats);
        System.out.println("Type: " + this.type);
    }

}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bike b1 = new Bike();
        b1.getdata();
        b1.showdata();
    }
}