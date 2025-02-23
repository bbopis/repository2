package project;

public class Dog {
    String name;
    String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Method to display dog details
    public void display() {
        System.out.println("Dog Name: " + name + ", Breed: " + breed);
    }
}
