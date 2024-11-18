import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExerciseDriver {
    
    public static void main(String[] args) {
        // create a priority queue of patients
        PriorityQueue<Patient> patients = new PriorityQueue<Patient>(Collections.reverseOrder());
        patients.add(new Patient("John", 3));
        patients.add(new Patient("Jane", 2));
        patients.add(new Patient("Art", 4));
        patients.add(new Patient("Eric", 10));

        // print the patients in order of priority
        while (patients.size() > 0) {
            Patient p = patients.poll();
            System.out.println(p);
        }
    }   

}
