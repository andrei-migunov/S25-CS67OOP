package O;

import java.io.Serializable;

public class Guitar implements Serializable {
    private String make;
    private String model;
    private double volume;
    private String wood;

    public Guitar(String make, String model, double volume) {
        this.make = make;
        this.model = model;
        this.volume = volume;
    }

    // Getters and Setters
    public String getMake() { return make; }
    public String getModel() { return model; }
    public double getVolume() { return volume; }
    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public void setVolume(double volume) { this.volume = volume; }

}
