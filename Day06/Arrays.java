public class Arrays {
    
    public static void main(String[] args) {

        int[] numbers; //declaring an array that can hold ints
        numbers = new int[6];

        // an array of 100 doubles
        double[] temperatures = new double[100];
        temperatures[0] = 78.4;

        char[] alphabet = new char[26];
        alphabet[0] = 'a';
        
        //each element can be accessed with a unique subscript (index)
        //indices start at 0
        numbers[0] = 10; 
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        numbers[5] = 60;
    }

}
