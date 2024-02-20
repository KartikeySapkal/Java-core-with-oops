public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name; // using this to refer to instance variable
        this.age = age;   // using this to refer to instance variable
    }

    // Method to display information about the person
    public void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age); // using this to refer to instance variables
    }

    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person person1 = new Person("John", 30);

        // Displaying information about the person
        person1.display();
    }
}
