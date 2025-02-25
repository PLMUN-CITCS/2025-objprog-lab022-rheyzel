// Car class definition
class Car {
    // Attributes (instance variables) for make, model, and year
    String make;
    String model;
    int year;

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car();

        // Assign values to the attributes of myCar
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;

        // Call the displayInfo method to print the car's information
        myCar.displayInfo();
    }
}
