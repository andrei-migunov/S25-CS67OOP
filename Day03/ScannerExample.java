// This program asks the user to enter the length and width of
// a rectangle. It calculates the rectangle's area and displays
// the value on the screen.

import java.util.Scanner;

public class ScannerExample {
   public static void main(String[] args) {

      Scanner keyboard = new Scanner(System.in); // declare and initialize Scanner
      int length, width, area;

      System.out.println("This program calculates the area of a rectangle");
      System.out.println("What is the length of the rectangle?");
      length = keyboard.nextInt();
		
      System.out.println("What is the width of the rectangle?");
      width = keyboard.nextInt();
		
      area = length * width;
      System.out.println("The area of the rectangle is " + area + ".");
      keyboard.close();
   }
}
