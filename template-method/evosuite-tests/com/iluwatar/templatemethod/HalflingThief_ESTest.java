/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 14:33:07 GMT 2024
 */

package com.iluwatar.templatemethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.templatemethod.HalflingThief;
import com.iluwatar.templatemethod.HitAndRunMethod;
import com.iluwatar.templatemethod.StealingMethod;
import com.iluwatar.templatemethod.SubtleMethod;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class HalflingThief_ESTest extends HalflingThief_ESTest_scaffolding {
@RegisterExtension
  static EvoRunnerJUnit5 runner = new EvoRunnerJUnit5(HalflingThief_ESTest.class);

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      HalflingThief halflingThief0 = new HalflingThief((StealingMethod) null);
      // Undeclared exception!
      try { 
        halflingThief0.steal();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.templatemethod.HalflingThief", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1()  throws Throwable  {
      HitAndRunMethod hitAndRunMethod0 = new HitAndRunMethod();
      HalflingThief halflingThief0 = new HalflingThief(hitAndRunMethod0);
      halflingThief0.changeMethod(hitAndRunMethod0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2()  throws Throwable  {
      SubtleMethod subtleMethod0 = new SubtleMethod();
      HalflingThief halflingThief0 = new HalflingThief(subtleMethod0);
      halflingThief0.steal();
  }
}
