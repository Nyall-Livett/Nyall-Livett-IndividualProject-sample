/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 13:33:07 GMT 2024
 */

package concreteextensions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import concreteextensions.Sergeant;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;
import units.SergeantUnit;

@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Sergeant_ESTest extends Sergeant_ESTest_scaffolding {
@RegisterExtension
  static EvoRunnerJUnit5 runner = new EvoRunnerJUnit5(Sergeant_ESTest.class);

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      SergeantUnit sergeantUnit0 = new SergeantUnit("");
      Sergeant sergeant0 = new Sergeant(sergeantUnit0);
      SergeantUnit sergeantUnit1 = sergeant0.getUnit();
      assertSame(sergeantUnit0, sergeantUnit1);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1()  throws Throwable  {
      Sergeant sergeant0 = new Sergeant((SergeantUnit) null);
      // Undeclared exception!
      try { 
        sergeant0.sergeantReady();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("concreteextensions.Sergeant", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2()  throws Throwable  {
      SergeantUnit sergeantUnit0 = new SergeantUnit("");
      Sergeant sergeant0 = new Sergeant(sergeantUnit0);
      sergeant0.sergeantReady();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test3()  throws Throwable  {
      Sergeant sergeant0 = new Sergeant((SergeantUnit) null);
      SergeantUnit sergeantUnit0 = sergeant0.getUnit();
      assertNull(sergeantUnit0);
  }
}
