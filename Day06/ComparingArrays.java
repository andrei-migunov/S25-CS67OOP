public class ComparingArrays {
    public static void main(String[] args) {
        int[] myArray = {0,2,4,6,8}; //shortcut for establishing values in an array
        int[] evens;
        evens = new int[5];
        for (int i=0; i<evens.length;i++) {
            evens[i] = i*2;
        }  
        if (myArray == evens) {
            System.out.println("The same!!");
        }
        else {
            System.out.println("Different");
        }
    }
}
