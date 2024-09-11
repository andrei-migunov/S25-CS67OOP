public class ConcatArray 
{
    public static void main(String[] args)
    {
        String[] myStrings = {"here","are","some","words"};
        String concatenatedString = ""; //initialize the result string

        for(int i = 0; i < myStrings.length; i++)
        {
            concatenatedString += myStrings[i];
        }

        System.out.println(concatenatedString);
    }    
}
