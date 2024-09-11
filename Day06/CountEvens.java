import java.util.Random;

public class CountEvens 
{
    public static void main(String[] args)
    {
        Random random = new Random(42); //42 is the random seed
        int evensCount = 0;
        int numRandomValues = 1000;
        int[] randomArray = new int[numRandomValues];
        
        for(int i = 0; i < numRandomValues; i++) 
        {
            randomArray[i] = random.nextInt(100);
        }

        for(int j = 0; j < numRandomValues; j++)
        {
            if(randomArray[j] % 2 == 0)
            {
                evensCount++;
            }
        }
        System.out.println("Number of evens: "+evensCount);
    }
}
