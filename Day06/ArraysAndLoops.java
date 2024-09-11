public class ArraysAndLoops {
    
    public static void main(String[] args) {
        int[] values = new int[25];
        System.out.println(values.length);

        //load the array with values
        for (int i=0; i < values.length; i++) {
            values[i] = i*10;
        }

        //print out the array
        for (int i=0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }

}
