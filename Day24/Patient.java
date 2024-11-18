/**
 * Patient class for the hospital simulation.
 */

public class Patient implements Comparable<Patient>{
    
    private String name;
    private double pain;

    /**
     * Constructs a new Patient object with the given name and pain level.
     * @param name
     * @param pain
     */
    public Patient(String name, double pain) {
        this.name = name;
        this.pain = pain;
    }

    /**
     * Returns the name and pain level of the patient.
     */
    public String toString() {
        return name + " " + pain;
    }

    /**
     * compareTo for Priority Queue implementation; priority based on pain level
     * @param o the other patient to compare to
     * @return integer for sorting and/or priority queue
     */
    @Override
    public int compareTo(Patient o) {
        if (this.pain < o.pain) {
            return -1;
        } else if (this.pain > o.pain) {
            return 1;
        } else {
            return 0;
        }
    }
}
