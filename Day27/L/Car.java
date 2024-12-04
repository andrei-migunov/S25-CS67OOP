package L;

public class Car implements Vehicle {
    private Engine engine;
    private String make;
    private String model;
    private String color;
    private double speed;

    public Car(String make, String model, String color) {
        this.engine = new Engine();
        this.make = make;
        this.model = model;
        this.color = color;
        this.speed = 0.0;
    }

    public void turnOnEngine() {
        engine.startEngine();
    }

    public void accelerate() {
        this.speed += 10;
    }

    @Override
    public void brake() {
       this.speed -= 5;
    }


}
