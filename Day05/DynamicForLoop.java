public class DynamicForLoop {
    public static void main(String[] args) {
        int limit = 5;

        for (int i = 0; i < limit; i++) {
            System.out.println("i = " + i);
            
            if (i == 2) {
                limit += 3; // Extends the loop at runtime
            }
        }
    }
}

