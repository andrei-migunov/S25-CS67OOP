import static org.junit.Assert.*;
import org.junit.Test;

public class Group5MoterCycleRideTester
{

   @Test
   public void WillRideDecisionTest1()
   {
      MoterCycleRideDecision Urness = new MoterCycleRideDecision(95,65,0.12,5,false);
      assertFalse(Urness.willRideMotercycle());
   }


   @Test
   public void WillRideDecisionTest2()
   {
      MoterCycleRideDecision Urness2 = new MoterCycleRideDecision(80,45,0.10,4,false);
      assertFalse(Urness2.willRideMotercycle());
   }
   

   @Test
   public void WillRideDecisionTest3()
   {
      MoterCycleRideDecision Urness3 = new MoterCycleRideDecision(80,60,0.20,6,false);
      assertFalse(Urness3.willRideMotercycle());
   }
   

   @Test
   public Void WillRideDecisionTest4()
   {
      MoterCycleRideDecision Urness4 = new MoterCycleRideDecision(81,65,0.12,12,false);
      assertFalse(Urness4.WillRideMotercycle());
   }
   
  
   @Test
   Public Void WillRideDecisionTest5()
   {
      MoterCycleRideDecision Urness5 = new MoterCycleRideDecision(81,65,0.12,5,false)
      assertTrue(Urness5.willRideMoterCycle());
   }
   

   @Test
   public Void willRideDecisionTest6()
   {
      MoterCycleRideDecision Urness6 = new MoterCycleRideDecision(100,40,0.17,11,true)
      assertTrue(Urness6.willRideMoterCycle());
   }

}
