public import static org.junit.Assert.*;
import org.junit.Test;

public class Group2MotocycleRideTester {
    @Test
    public void willRideMotorcycleTest1(){
        MotorcycleRideDecision m = new MotorcycleRideDecision(90.0,54.0,16.0,11.0,true);    
        assertTrue(m.willRideMotorcycle());
    }
    @Test(expected = IllegalArgumentException.class)
    public void willRideMotorcycleTest2(){
        MotorcycleRideDecision m = new MotorcycleRideDecision(70.0,57.0,10.0,5.0,"false");    
    }
    @Test(expected = ImproperRainException.class)
    public void willRideMotorcycleTest3(){
        MotorcycleRideDecision m = new MotorcycleRideDecision(70.0,57.0,-10.0,5.0,false);    
    }
    @Test(expected = IllegalArgumentException.class)
    public void willRideMotorcycleTest4(){
        MotorcycleRideDecision m = new MotorcycleRideDecision(70,57,10,5,false);    
    }
}
