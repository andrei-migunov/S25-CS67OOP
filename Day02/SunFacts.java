/* 
 * illustration of floating-point types
 */
public class SunFacts {

	public static void main(String[] args)
	{
		double distance;
		float mass;
	      
		distance = 1.495979E11;  // equivalent to 1.495979 x 10^11 
		mass = 1.989E30F; // note the conversion to a float by using F
	    
		System.out.println("The sun is " + distance + " meters away.");
		System.out.println("The sun's mass is " + mass + " kilograms.");
	}
} 
