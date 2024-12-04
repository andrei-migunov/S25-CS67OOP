package L;

public class ElectricCar implements Vehicle {
    private String make;
    private String model;
    private String color;
    private double speed;

    public ElectricCar(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.speed = 0.0;
    }

    public void turnOnEngine() {
        throw new RuntimeException("An electric car has no engine!");
    }

    public void accelerate() {
        this.speed += 15;
    }

    public void brake() {
        this.speed -= 5;
    }
    
}
