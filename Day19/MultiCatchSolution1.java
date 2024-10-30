/**
 * Example of code that could have multiple exceptions thrown
 * note: This solution uses multiple catch statements
 */

import java.io.*;
import java.util.*;

public class MultiCatchSolution1
{
   public static void main(String[] args)
   {
      int number;
      
      try {
         File file = new File("Numbers.txt");
         Scanner inputFile = new Scanner(file);

         while (inputFile.hasNext())
         {
            number = inputFile.nextInt();
            System.out.println(number);
         }
         inputFile.close();
      }
      catch(FileNotFoundException e)
      {
    	  System.out.println("Cannot find the file Numbers.txt");
      }
      catch(InputMismatchException e)
      {
    	  System.out.println("The file contains non-integers.");
      }
   }
}