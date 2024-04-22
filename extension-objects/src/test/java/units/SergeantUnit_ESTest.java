/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 15:06:37 GMT 2024
 */

package units;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import abstractextensions.UnitExtension;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;
import units.SergeantUnit;

 
public class SergeantUnit_ESTest  {


  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      SergeantUnit sergeantUnit0 = new SergeantUnit("Z)X7t:QoQWqF+b0");
      // Undeclared exception!
      try { 
        sergeantUnit0.getUnitExtension((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1()  throws Throwable  {
      SergeantUnit sergeantUnit0 = new SergeantUnit("<aT9B");
      UnitExtension unitExtension0 = sergeantUnit0.getUnitExtension("SergeantExtension");
      assertNotNull(unitExtension0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2()  throws Throwable  {
      SergeantUnit sergeantUnit0 = new SergeantUnit("units.SergeantUnit");
      UnitExtension unitExtension0 = sergeantUnit0.getUnitExtension("units.SergeantUnit");
      assertNull(unitExtension0);
  }
}
