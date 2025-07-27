class Vehicle {
    String make, model;
    int year, maximumSpeed;

    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    public void drive() {
        System.out.println("Vehicle is driving.");
    }

    public void printDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Max Speed: " + maximumSpeed);
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make + " " + model + " Car is driving.");
    }
}

class Bike extends Vehicle {
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving.");
    }
}

public class A1 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, 200);
        Bike bike = new Bike("Honda", "CBR", 2021, 180);

        car.printDetails();
        car.drive();

        System.out.println();

        bike.printDetails();
        bike.drive();
    }
}
