public class FormattingExample {
    public static void main(String[] args) {
        double ratio = 4.0/3.0;
        System.out.println("Four thirds = " + ratio); 
        System.out.printf("Four thirds = %.3f\n", ratio);
    }
}
