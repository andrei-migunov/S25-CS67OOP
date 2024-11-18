// Purpose: Represents a rocket ship that can be launched into space.

/**
 * The RocketShip class represents a rocket ship that can be launched into space.
 */
public class RocketShip  implements Comparable<RocketShip>{

    private String name;
    private int fuel;
    private int speed;
    private int altitude;

    /**
     * Constructs a new RocketShip object with the given name, fuel, speed, and altitude.
     * @param name the name of the rocket ship
     * @param fuel the amount of fuel in the rocket ship
     * @param speed the speed of the rocket ship
     * @param altitude the altitude of the rocket ship
     */
    public RocketShip(String name, int fuel, int speed, int altitude) {
        this.name = name;
        this.fuel = fuel;
        this.speed = speed;
        this.altitude = altitude;
    }

    /**
     * Sets the name of the rocket ship.
     * @param name the new name of the rocket ship
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Sets the amount of fuel in the rocket ship.
     * @param fuel the new amount of fuel in the rocket ship
     */
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    /**
     * Sets the speed of the rocket ship.
     * @param speed the new speed of the rocket ship
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Launches the rocket ship into space.
     */
    public void launch() {
        System.out.println("3... 2... 1... BLAST OFF!");
    }

    /**
     * Returns a string representation of the rocket ship.
     */
    @Override
    public String toString() {    
        return "Name: " + name + " Fuel: " + fuel + " " + "Speed: " + speed + " Alt: " + altitude;
    }

    @Override
    public int compareTo(RocketShip o) {
        if (this.speed < o.speed) {
            return -1;
        } else if (this.speed > o.speed) {
            return 1;
        } else {
            return 0;
        }
    } 

}