package I;

public class ZooEmployee implements BearKeeper {
    private String name;
    private int yearsOfExperience;
    private int tasksCompleted;

    public ZooEmployee(String name, int yearsOfExperience) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.tasksCompleted = 0;
    }
    
    public void washTheBear() {
        System.out.println("Washing the bear");
        tasksCompleted++;
    }

    public void feedTheBear() {
        System.out.println("Feeding the bear");
        tasksCompleted++;
    }

    public void petTheBear() {
        //pet the bear?!?
    }

}
