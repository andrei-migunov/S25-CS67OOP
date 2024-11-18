public class ExecutionTimer {

    public static void main(String[] args) {
        // Start the timing
        long startTime = System.nanoTime();
        
        // The code you want to time
        performSomeOperation();
        
        // End the timing
        long endTime = System.nanoTime();
        
        // Calculate the time taken in milliseconds
        long timeElapsed = (endTime - startTime);
        
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
    }

    private static void performSomeOperation() {
        // Simulate some operations
        for (int i = 0; i < 1000; i++) {
            int j = i * i;
        }
    }
}
