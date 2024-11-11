import static org.junit.Assert.*;
import org.junit.Test;

public class Group4MotorcycleRideTester {

   @Test
   public void getHighTempTest(){

       boolean t =  MotorcycleRideDecision.willRideMotorcycle(110, 55, 6, 0, false);
       assertTrue(t);

   }

   @Test
   public void getLowTempTest(){

       boolean t =  MotorcycleRideDecision.willRideMotorcycle(88, 45, 5, 12, false);
       assertTrue(t);

   }

   @Test
   public void getChanceofRainTest(){

       boolean t =  MotorcycleRideDecision.willRideMotorcycle(88, 60, 50, 4, false);
       assertTrue(t);

   }
   @Test
   public void getHighTempTest(){

       boolean t =  MotorcycleRideDecision.willRideMotorcycle(88, 55, 10, 12, false);
       assertTrue(t);

   }

}
