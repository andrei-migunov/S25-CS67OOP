public class Mystery {
 
    public static void cutInHalf(double num) {
        num = num/2.0;
    }

    public static void sliceInHalf(double[] numArray) {
        numArray[0] = numArray[0]/2.0;
    }

    public static void replaceArray(double[] numArray) {
        numArray = new double[1];
        numArray[0] = 3.14159;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        // int x = 7;
        // int y = -23;
        // swap(x,y);
        // System.out.println("x is " + x + " and y is " + y);

        double data1 = 10.0;
        double[] data2 = new double[1];
        data2[0] = 10.0;
        cutInHalf(data1);
        // sliceInHalf(data2);
        replaceArray(data2);
        System.out.println(data1);
        System.out.println(data2[0]);
        

        

    }

}
