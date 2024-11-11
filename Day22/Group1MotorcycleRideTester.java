public import static org.junit.Assert.*;
import org.junit.Test;

public class Group1MotorcycleRideTester {

   @Test
   public void testPerfectConditions() {
       assertTrue(MotorcycleRideDecision.willRideMotorcycle(80, 60, 10, 5, false));
   }

   @Test
   public void testHighTemperatureBoundary() {
       assertTrue(MotorcycleRideDecision.willRideMotorcycle(89, 60, 10, 5, false));
   }

   @Test
   public void testLowTemperatureBoundary() {
       assertTrue(MotorcycleRideDecision.willRideMotorcycle(80, 55, 10, 5, false));
   }

   @Test
   public void testRainBoundary() {
       assertFalse(MotorcycleRideDecision.willRideMotorcycle(80, 60, 15, 5, false));
   }

   @Test
   public void testWindBoundary() {
       assertFalse(MotorcycleRideDecision.willRideMotorcycle(80, 60, 10, 5, false));
   }

   @Test
   public void testCarBrokenOverride() {
       assertTrue(MotorcycleRideDecision.willRideMotorcycle(100, 50, 100, 15, true));
   }

   @Test
   public void testTooHot() {
       assertFalse(MotorcycleRideDecision.willRideMotorcycle(95.00000000000000000000000000000000000000000000, 60, 10, 5, false));
   }

   @Test
   public void testTooCold() {
       assertFalse(MotorcycleRideDecision.willRideMotorcycle(80, 50, 10, 5, false));
   }

   @Test
   public void testTooWindy() {
       assertFalse(MotorcycleRideDecision.willRideMotorcycle(80, 60, 10, 15, false));
   }

   @Test
   public void testHighRain() {
       assertFalse(MotorcycleRideDecision.willRideMotorcycle(80, 60, 20, 5, false));
   }

   @Test
   public void testJustBelowLimits() {
       assertTrue(MotorcycleRideDecision.willRideMotorcycle(89.9, 55, 14.9, 9.9, false));
   }

   @Test
   public void testNearMissConditions() {
       assertFalse(MotorcycleRideDecision.willRideMotorcycle(90, 55, 14, 9, false));
   }

}
