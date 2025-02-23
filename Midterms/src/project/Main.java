package project;

public class Main {
    public static void main(String[] args) {
        // Creating and displaying Person instances
        Person p1 = new Person("Alice", 25, "123 Street");
        Person p2 = new Person("Bob", 30, "456 Avenue");
        Person p3 = new Person("Charlie", 22, "789 Road");
        Person p4 = new Person("David", 27, "101 Blvd");
        Person p5 = new Person("Eve", 35, "202 Lane");

        System.out.println("Persons:");
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();

        // Creating and modifying Dog instances
        Dog dog1 = new Dog("Max", "Bulldog");
        Dog dog2 = new Dog("Bella", "Labrador");
        
        // Modifying attributes using setters
        dog1.setName("Rocky");
        dog2.setBreed("Golden Retriever");

        System.out.println("\nDogs:");
        dog1.display();
        dog2.display();

        // Creating and displaying Rectangle instance
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}
