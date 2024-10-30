/**
 * Example of creating your own exceptions
 * IncorrectPassworException inherits from RuntimeException
 */

public class IncorrectPasswordException extends RuntimeException
{
	public IncorrectPasswordException() 
	{
		super("Incorrect Password");
	}
}