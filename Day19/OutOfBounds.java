/**
 * Example of a runtime exception thrown
 * ArrayIndexOutOfBounds
 */

public class OutOfBounds {

	public static void main(String[] args) {
		System.out.println("An exception is about to be thrown...");
		int[] arr = {1, 2, 3, 4, 5};
		arr[34] = 23; // This line "throws" an ArrayIndexOutOfBoundsException
	}
} 
