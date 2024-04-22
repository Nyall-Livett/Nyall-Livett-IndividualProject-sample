/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 15:22:31 GMT 2024
 */

package com.iluwatar.trampoline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import com.iluwatar.trampoline.Trampoline;
import com.iluwatar.trampoline.TrampolineApp;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TrampolineApp_ESTest extends TrampolineApp_ESTest_scaffolding {
@RegisterExtension
  static EvoRunnerJUnit5 runner = new EvoRunnerJUnit5(TrampolineApp_ESTest.class);

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      Trampoline<Integer> trampoline0 = TrampolineApp.loop((-120), (-120));
      assertNotNull(trampoline0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1()  throws Throwable  {
      Trampoline<Integer> trampoline0 = TrampolineApp.loop(0, 0);
      assertTrue(trampoline0.complete());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2()  throws Throwable  {
      Trampoline<Integer> trampoline0 = TrampolineApp.loop(1, 1);
      assertNotNull(trampoline0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test3()  throws Throwable  {
      TrampolineApp trampolineApp0 = new TrampolineApp();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[2];
      TrampolineApp.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }
}
