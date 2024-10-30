/**
 * Example of code that could have multiple exceptions thrown
 * note: This solution uses a single catch statement
 */

import java.io.*;
import java.util.*;

public class MultiCatchSolution2
{
   public static void main(String[] args)
   {
      int number;
      
      try
      {
         File file = new File("Numbers.txt");
         Scanner inputFile = new Scanner(file);

         while (inputFile.hasNext())
         {
            number = inputFile.nextInt();
            System.out.println(number);
         }
         inputFile.close();
      }
      catch(FileNotFoundException | InputMismatchException e)
      {
    	  System.out.println("Error Processing the file.");
      }
   }
}