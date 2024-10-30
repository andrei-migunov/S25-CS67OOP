/**
 * Example of code that could have multiple exceptions thrown
 * note: There is no catch statement, so this code has a syntax error
 */

import java.io.*;
import java.util.*;

public class MultiCatch
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
   }
}